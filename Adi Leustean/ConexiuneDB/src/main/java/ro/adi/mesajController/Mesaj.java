package ro.adi.mesajController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ro.adi.entities.Text;
import ro.adi.utils.DBConnection;

public class Mesaj {

	
	public ArrayList<Text> veziLista() {
		ArrayList<Text> mesaje = new ArrayList<Text>();
		Connection c = DBConnection.getConnection();
		try {
			PreparedStatement ps = c.prepareStatement("SELECT * FROM Stations");
			ResultSet rs = ps.executeQuery();
			
				

			while(rs.next()){
				Text t= new Text();
				t.setText(rs.getString(2));
					mesaje.add(t);
				}
					
				
					
				
				
				
			
			
		}
		
	catch(Exception E){}
		return mesaje;
	
	
	}}
	
	
	
	

