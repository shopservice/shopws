package com.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Christophe Coenraets
 */
public class ProductDAO {

    public List<Product> findAll() {
        List<Product> list = new ArrayList<Product>();
        Connection c = null;
    	String sql = "SELECT * FROM wine ORDER BY name";
        try {
            c = ConnectionHelper.getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                list.add(processRow(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
        return list;
    }

    
    public List<Product> findByName(String name) {
        List<Product> list = new ArrayList<Product>();
        Connection c = null;
    	String sql = "SELECT * FROM wine as e " +
			"WHERE UPPER(name) LIKE ? " +	
			"ORDER BY name";
        try {
            c = ConnectionHelper.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, "%" + name.toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(processRow(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
        return list;
    }
    
    public Product findById(int id) {
    	String sql = "SELECT * FROM wine WHERE id = ?";
        Product product = null;
        Connection c = null;
        try {
            c = ConnectionHelper.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                product = processRow(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
        return product;
    }

    public Product save(Product product)
	{
		return product.getId() > 0 ? update(product) : create(product);
	}    
    
    public Product create(Product product) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = ConnectionHelper.getConnection();
            ps = c.prepareStatement("INSERT INTO wine (name, material, country, region, year, picture, description) VALUES (?, ?, ?, ?, ?, ?, ?)",
                new String[] { "ID" });
            ps.setString(1, product.getName());
            ps.setString(2, product.getMaterial());
            ps.setString(3, product.getCountry());
            ps.setString(4, product.getRegion());
            ps.setString(5, product.getYear());
            ps.setString(6, product.getPicture());
            ps.setString(7, product.getDescription());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            // Update the id in the returned object. This is important as this value must be returned to the client.
            int id = rs.getInt(1);
            product.setId(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
        return product;
    }

    public Product update(Product product) {
        Connection c = null;
        try {
            c = ConnectionHelper.getConnection();
            PreparedStatement ps = c.prepareStatement("UPDATE wine SET name=?, material=?, country=?, region=?, year=?, picture=?, description=? WHERE id=?");
            ps.setString(1, product.getName());
            ps.setString(2, product.getMaterial());
            ps.setString(3, product.getCountry());
            ps.setString(4, product.getRegion());
            ps.setString(5, product.getYear());
            ps.setString(6, product.getPicture());
            ps.setString(7, product.getDescription());
            ps.setInt(8, product.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
        return product;
    }

    public boolean remove(int id) {
        Connection c = null;
        try {
            c = ConnectionHelper.getConnection();
            PreparedStatement ps = c.prepareStatement("DELETE FROM wine WHERE id=?");
            ps.setInt(1, id);
            int count = ps.executeUpdate();
            return count == 1;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
    }

    protected Product processRow(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setId(rs.getInt("id"));
        product.setName(rs.getString("name"));
        product.setMaterial(rs.getString("material"));
        product.setCountry(rs.getString("country"));
        product.setRegion(rs.getString("region"));
        product.setYear(rs.getString("year"));
        product.setPicture(rs.getString("picture"));
        product.setDescription(rs.getString("description"));
        return product;
    }
    
}
