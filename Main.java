package kullanicibilgileri;

public class Main {

	public static void main(String[] args) {
		kullanicimanager Kullanicimanager = new kullanicimanager();
		Kullanicimanager.add();
		
		FacebookManager facebookmanager = new FacebookManager();
		facebookmanager.log();
		
		instagramLogger instagramLogger = new instagramLogger();
		instagramLogger.log();
		
		TwitterManager TwitterManager = new TwitterManager();
		TwitterManager.log();
		
		SnapchatManager SnapchatManager = new SnapchatManager();
		SnapchatManager.log();
		
		Gmailmanager Gmailmanager = new Gmailmanager();
		Gmailmanager.log();
 
	}

}
