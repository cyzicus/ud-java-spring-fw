package us.cyzic.tutorial.udemy.spring.framework;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("offersDao")
public class OffersDAO {
	
	private JdbcTemplate jdbc;
	
	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}
	
	public List<Offer> getOffers() {
		
		
		return jdbc.query("select * from offers", new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Offer(
						rs.getInt("id"), 
						rs.getString("name"), 
						rs.getString("email"), 
						rs.getString("text")
				);
				
			}
			
		});
		
	}

}
