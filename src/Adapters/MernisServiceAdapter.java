package Adapters;

import java.rmi.RemoteException;

import Abstract.PlayerConfirmationService;
import Entity.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerConfirmationService{

	@Override
	public boolean save(Player player) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getTcNo()),
					player.getName(), player.getSurName(), 
					player.getDateOfBirth());
		}
		catch(RemoteException e) {
			e.printStackTrace();
		}
		return false;
	
	}

}
