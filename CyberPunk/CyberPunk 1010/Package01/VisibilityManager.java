 package Package01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VisibilityManager {
    UI ui;
    Storyclass story = new Storyclass(null, ui, null);
	public  VisibilityManager(UI userinterface ) {
	 ui = userinterface;	
	}
	public void showTitleScreen() {
	 
	//shows title screen 
	 ui.imghandle("wow.jpg");	 
     ui.title.setVisible(true);	
	 ui.strtbtn.setVisible(true);
	 ui.strtimp.setVisible(true);
	 ui.loadbuttonpnl.setVisible(true);
	//hides GameScreen
	 ui.chcbtn4.setVisible(false);
	 ui.chcbtn3.setVisible(false); 
	 ui.chcbtn2.setVisible(false); 
	 ui.chcbtn2.setVisible(false);
	 ui.chcbtn.setVisible(false);
	 ui.mtxt.setVisible(false);
	 ui.cimp.setVisible(false);
	 ui.rtbp.setVisible(false);
	 ui.plyr.setVisible(false);
	 ui.savebtnpnl.setVisible(false);
	 ui.opnclsinv.setVisible(false);
    ui.sleepbtnpnl.setVisible(false);
	 ui.cafeshppnl.setVisible(false);
	 ui.cafeshop.setVisible(false);
	 ui.selltab.setVisible(false);
     ui.sellpnl.setVisible(false);
     ui.cnimgpnl.setVisible(false);
     ui.mimgpnl.setVisible(false);
     ui.testcombatpnl.setVisible(false);
     ui.combatbtnpnl.setVisible(false);
	}
     public void TitletoNightCity() {
    	 
    	 //hides title screen 
    	 ui.title.setVisible(false);	
    	 ui.strtbtn.setVisible(false);
    	 ui.strtimp.setVisible(false);	
    	 ui.mtxt.setVisible(true);
    	 ui.text=" Welcome to Night City, Where to?";
    	 ui.textprep();
    			 
    	 ui.cimp.setVisible(false);
    	 //shows game screen
    	 
    	 ui.chcbtn4.setVisible(true);
    	 ui.chcbtn3.setVisible(true); 
    	 ui.chcbtn2.setVisible(true); 
    	 ui.chcbtn.setVisible(true);
         ui.ncimp.setVisible(true);
         
         ui.rtbp.setVisible(false);
         ui.loadbuttonpnl.setVisible(false);
         ui.rimgpnl.setVisible(false);
         ui.savebtnpnl.setVisible(false);
         ui.plyr.setVisible(false);
    	 ui.opnclsinv.setVisible(true);
    	 ui.sleepbtnpnl.setVisible(false);
    	 ui.cafeshppnl.setVisible(false);
    	 ui.cafeshop.setVisible(false);
    	 ui.selltab.setVisible(false);
         ui.sellpnl.setVisible(false);
         ui.cnimgpnl.setVisible(false);
         ui.mimgpnl.setVisible(false);
         ui.testcombatpnl.setVisible(false);
         ui.combatbtnpnl.setVisible(false);
     }
	public void NightCitytoCafe() {
		 ui.title.setVisible(false);	
    	 ui.strtbtn.setVisible(false);
    	 ui.strtimp.setVisible(false);	
    	 ui.text="Enjoy some cofee and some Games!!";
    	 ui.textprep();
    	
    	 ui.mtxt.setVisible(true);
    	 
    	 
    	 //shows game screen
    	 
    	 ui.chcbtn4.setVisible(false);
    	 ui.chcbtn3.setVisible(false); 
    	 ui.chcbtn2.setVisible(false); 
    	 ui.chcbtn.setVisible(false);
         ui.ncimp.setVisible(false);
         
         ui.rtbp.setVisible(true);
         ui.cimp.setVisible(true);
         ui.aimgpnl.setVisible(false);
         ui.savebtnpnl.setVisible(false);  
         ui.rimgpnl.setVisible(false);
         ui.plyr.setVisible(false);
    	 ui.opnclsinv.setVisible(true);
    	 ui.sleepbtnpnl.setVisible(false);
    	 ui.cafeshppnl.setVisible(true);
    	 ui.ripshppnl.setVisible(false);
    	 ui.selltab.setVisible(true);
         ui.sellpnl.setVisible(true);
         ui.cnimgpnl.setVisible(false);
         ui.mimgpnl.setVisible(false);
         ui.testcombatpnl.setVisible(false);
         ui.combatbtnpnl.setVisible(false);
        
	}
	public void ReturntoNightCity() {
		 ui.title.setVisible(false);	
    	 ui.strtbtn.setVisible(false);
    	 ui.strtimp.setVisible(false);	
    	 ui.mtxt.setVisible(true);
    	 //shows game screen
    	 
    	 ui.chcbtn4.setVisible(true);
    	 ui.chcbtn3.setVisible(true); 
    	 ui.chcbtn2.setVisible(true); 
    	 ui.chcbtn.setVisible(true);
         ui.ncimp.setVisible(true);
         
         ui.cimp.setVisible(false);
	     ui.rtbp.setVisible(false);	
	     ui.loadbuttonpnl.setVisible(false);
	     ui.aimgpnl.setVisible(false);
	     ui.savebtnpnl.setVisible(false);
	     ui.rimgpnl.setVisible(false);
	     ui.plyr.setVisible(false);
		 ui.opnclsinv.setVisible(true);
		 ui.sleepbtnpnl.setVisible(false);
		 ui.cafeshppnl.setVisible(false);
		 ui.cafeshop.setVisible(false);
		 ui.ripshppnl.setVisible(false);
		 ui.selltab.setVisible(false);
	       ui.sellpnl.setVisible(false);
	       ui.cnimgpnl.setVisible(false);
	       ui.ripshpbtnpnl.setVisible(false);
	       ui.mimgpnl.setVisible(false);
	       ui.testcombatpnl.setVisible(false);
	       ui.combatbtnpnl.setVisible(false);
	      
	}
     public void NightCityToApartment() {
    	 ui.title.setVisible(false);	
    	 ui.strtbtn.setVisible(false);
    	 ui.strtimp.setVisible(false);	
    	 ui.mtxt.setVisible(false);
    	 //shows game screen
    	 
    	 ui.chcbtn4.setVisible(false);
    	 ui.chcbtn3.setVisible(false); 
    	 ui.chcbtn2.setVisible(false); 
    	 ui.chcbtn.setVisible(false);
         ui.ncimp.setVisible(false);
         
         ui.cimp.setVisible(false);	
	     ui.loadbuttonpnl.setVisible(false);
	     ui.aimgpnl.setVisible(true);
	     ui.rtbp.setVisible(true);	
	     ui.savebtnpnl.setVisible(true);
	     ui.rimgpnl.setVisible(false);
	     ui.plyr.setVisible(false);
	     ui.opnclsinv.setVisible(true);
	     ui.sleepbtnpnl.setVisible(true);
		 ui.cafeshppnl.setVisible(false);
		 ui.cafeshop.setVisible(false);
		 ui.ripshppnl.setVisible(false);
		 ui.selltab.setVisible(false);
	       ui.sellpnl.setVisible(false);
	       ui.cnimgpnl.setVisible(false);
	       ui.mimgpnl.setVisible(false);
	       ui.testcombatpnl.setVisible(false);
	       ui.combatbtnpnl.setVisible(false);
     }
     public void NightCityToRipperDoc() {
    	 ui.title.setVisible(false);	
    	 ui.strtbtn.setVisible(false);
    	 ui.strtimp.setVisible(false);	
    	 ui.mtxt.setVisible(true);
    	 //shows game screen
    	 
    	 ui.chcbtn4.setVisible(false);
    	 ui.chcbtn3.setVisible(false); 
    	 ui.chcbtn2.setVisible(false); 
    	 ui.chcbtn.setVisible(false);
         ui.ncimp.setVisible(false);
         
         ui.cimp.setVisible(false);	
	     ui.loadbuttonpnl.setVisible(false);
	     ui.aimgpnl.setVisible(false);
	     ui.rtbp.setVisible(true);	
	     ui.savebtnpnl.setVisible(false);
	     ui.rimgpnl.setVisible(true);
	     ui.plyr.setVisible(true);
	     ui.opnclsinv.setVisible(true);
	     ui.sleepbtnpnl.setVisible(false);
		 ui.cafeshppnl.setVisible(false);
		 ui.cafeshop.setVisible(false);
	     ui.ripshppnl.setVisible(true);
	     ui.selltab.setVisible(true);
	     ui.sellpnl.setVisible(true);
	     ui.cnimgpnl.setVisible(false);
	     ui.mimgpnl.setVisible(false);
	     ui.testcombatpnl.setVisible(false);
	     ui.combatbtnpnl.setVisible(false);
     }
     public void tocontracts() {
    	  ui.combatbtnpnl.setVisible(false);
    	 
    	 ui.title.setVisible(false);	
    	 ui.strtbtn.setVisible(false);
    	 ui.strtimp.setVisible(false);	
    	 ui.mtxt.setVisible(true);
    	 //shows game screen
    	 
    	 ui.chcbtn4.setVisible(false);
    	 ui.chcbtn3.setVisible(false); 
    	 ui.chcbtn2.setVisible(false); 
    	 ui.chcbtn.setVisible(false);
         ui.ncimp.setVisible(false);
         
         
         
         ui.cimp.setVisible(false);	
	     ui.loadbuttonpnl.setVisible(false);
	     ui.aimgpnl.setVisible(false);
	     ui.rtbp.setVisible(true);	
	     ui.savebtnpnl.setVisible(false);
	     ui.rimgpnl.setVisible(false);
	     ui.plyr.setVisible(false);
	     ui.opnclsinv.setVisible(false);
	     ui.sleepbtnpnl.setVisible(false);
		 ui.cafeshppnl.setVisible(false);
		 ui.cafeshop.setVisible(false);
		 ui.ripshppnl.setVisible(false);
		 ui.selltab.setVisible(false);
	       ui.sellpnl.setVisible(false);
	       ui.cnimgpnl.setVisible(true);
	       ui.mimgpnl.setVisible(true);
	       ui.testcombatpnl.setVisible(true );
	     
	       
     }
     
     public void tocombat() {
    	 ui.title.setVisible(false);	
    	 ui.strtbtn.setVisible(false);
    	 ui.strtimp.setVisible(false);	
    	 ui.mtxt.setVisible(true);
    	 //shows game screen
    	 
    	 ui.chcbtn4.setVisible(false);
    	 ui.chcbtn3.setVisible(false); 
    	 ui.chcbtn2.setVisible(false); 
    	 ui.chcbtn.setVisible(false);
         ui.ncimp.setVisible(false);
         
         
         
         ui.cimp.setVisible(false);	
	     ui.loadbuttonpnl.setVisible(false);
	     ui.aimgpnl.setVisible(false);
	     ui.rtbp.setVisible(true);	
	     ui.savebtnpnl.setVisible(false);
	     ui.rimgpnl.setVisible(false);
	     ui.plyr.setVisible(true);
	     ui.opnclsinv.setVisible(false);
	     ui.sleepbtnpnl.setVisible(false);
		 ui.cafeshppnl.setVisible(false);
		 ui.cafeshop.setVisible(false);
		 ui.ripshppnl.setVisible(false);
		 ui.selltab.setVisible(false);
	       ui.sellpnl.setVisible(false);
	       ui.cnimgpnl.setVisible(false);
	       ui.mimgpnl.setVisible(true);
	       ui.testcombatpnl.setVisible(false );
	       ui.combatbtnpnl.setVisible(true);
	       
     }
     
     
     
     
     
     public void Hideall() {
   	 ui.title.setVisible(false);	
	 ui.strtbtn.setVisible(false);
	 ui.strtimp.setVisible(false);	
	 ui.mtxt.setVisible(false);
	 //shows game screen
	 
	 ui.chcbtn4.setVisible(false);
	 ui.chcbtn3.setVisible(false); 
	 ui.chcbtn2.setVisible(false); 
	 ui.chcbtn.setVisible(false);
     ui.ncimp.setVisible(false);
     
     ui.cimp.setVisible(false);	
     ui.loadbuttonpnl.setVisible(false);
     ui.aimgpnl.setVisible(false);
     ui.rtbp.setVisible(false);	
     ui.savebtnpnl.setVisible(false);
     ui.rimgpnl.setVisible(false);
     ui.plyr.setVisible(false);
     ui.opnclsinv.setVisible(false);
     ui.sleepbtnpnl.setVisible(false);
	 ui.cafeshppnl.setVisible(false);
	 ui.cafeshop.setVisible(false);
	  ui.ripshppnl.setVisible(false);
	  ui.selltab.setVisible(false);
      ui.sellpnl.setVisible(false); 
      ui.cnimgpnl.setVisible(false);
      ui.mimgpnl.setVisible(true);
      ui.testcombatpnl.setVisible(false);
      ui.combatbtnpnl.setVisible(false);
    }
    public void monsterattacks() {
    	ui.combatbtnpnl.setVisible(false);
    }
    public void playerattacks() {
    	ui.combatbtnpnl.setVisible(true);
    }
}


