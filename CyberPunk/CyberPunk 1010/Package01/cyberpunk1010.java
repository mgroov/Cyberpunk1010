package Package01;
import javax.swing.*;


import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//=====================================================================
public class cyberpunk1010 {
  
	//class calls 
	UI ui = new UI();
	ChoiceHandler chandler = new ChoiceHandler();
	VisibilityManager vm = new VisibilityManager(ui);
	Storyclass story = new Storyclass(this,ui,vm);
	TitleHandler thandle =  new TitleHandler();
	InventoryHandler ihandle = new InventoryHandler();
	InfoHandler inhandle = new InfoHandler();
	MouseHandle mhandle =  new MouseHandle();
	
	 String invtstatus = "close";
	 String shopstatus = "close";
	 String rshopstatus = "close";
	 String sellpos = "buying";
//======================================================================
	String nextPos1,nextPos2,nextPos3,nextPos4;
	public static void main(String[] args) {
	
		new cyberpunk1010();
	
	}//of main
//=======================================================================
	public cyberpunk1010(){
	 
	   ui.createUI(chandler, thandle,ihandle,inhandle,mhandle); 
	   vm.showTitleScreen();
	 
	   
   }//of CyberPunk
//======================================================================
   public class ChoiceHandler implements ActionListener{
	   public void actionPerformed(ActionEvent event) {
        String YourChoice = event.getActionCommand();
        
        switch(YourChoice) {
        
        case "c1":vm.NightCitytoCafe();break;
        case "c2":vm.tocontracts();ui.text="Here you can accept jobs";ui.textprep();ui.maintext.setVisible(true);ui.mimgpnl.setVisible(true);break;
        case "c3":story.aprt();vm.NightCityToApartment();break;
        case "c4":vm.NightCityToRipperDoc();break;
        case "return":vm.ReturntoNightCity();break;
        case "save": story.savePlayerData();ui.maintext.setText("You have a restful nights sleep /n Data Saved."); break;
        case "sleep": story.sleep();break;
        }//case 
	   
	   }}
	   public class TitleHandler implements ActionListener{
		   public void actionPerformed(ActionEvent event) {
	        String YourChoice = event.getActionCommand();
	        
	        switch(YourChoice) {
	        case "start":story.defaultSetup();vm.TitletoNightCity(); break;
	        case "load":story.loadPlayerData();vm.TitletoNightCity();break; 
	      
	        }//case 
		   }
}//of title handle
	   
	   public class InventoryHandler implements ActionListener{
		   public void actionPerformed(ActionEvent event) {
	        String YourChoice = event.getActionCommand();
	         
	        switch(YourChoice) {
	        case "inventory":{
	        	if(invtstatus.equals("close")) {
	        		
	        		ui.invtpnl.setVisible(true);
	        		invtstatus="open";
	        		ui.ibtn1.setText(story.playeritem[0].itemname);
	        		ui.ibtn2.setText(story.playeritem[1].itemname);
	        		ui.ibtn3.setText(story.playeritem[2].itemname);
	        		ui.ibtn4.setText(story.playeritem[3].itemname);
	        		ui.ibtn5.setText(story.playeritem[4].itemname);
	        		ui.ibtn6.setText(story.playeritem[5].itemname);
	        		ui.ibtn7.setText(story.playeritem[6].itemname);
	        		ui.ibtn8.setText(story.playeritem[7].itemname);
	        		ui.ibtn9.setText(story.playeritem[8].itemname);
	        		ui.ibtn10.setText(story.playeritem[9].itemname);
	        	
	        	}
	        	else if(invtstatus.equals("open")) {
	        		ui.invtpnl.setVisible(false);
	        		invtstatus="close";
	        		
	        	}
	        	}//case 
	        case"-1": break;
	        case "1":if(sellpos.equals("buying")) { story.itemused(0);break;}else{story.itemsold(0);break;}
	        case "2": if(sellpos.equals("buying")) { story.itemused(1);break;}else{story.itemsold(1);break;}
	        case "3": if(sellpos.equals("buying")) { story.itemused(2);break;}else{story.itemsold(2);break;}
	        case "4": if(sellpos.equals("buying")) { story.itemused(3);break;}else{story.itemsold(3);break;}
	        case "5": if(sellpos.equals("buying")) { story.itemused(4);break;}else{story.itemsold(4);break;}
	        case "6": if(sellpos.equals("buying")) { story.itemused(5);break;}else{story.itemsold(5);break;}
	        case "7": if(sellpos.equals("buying")) { story.itemused(6);break;}else{story.itemsold(6);break;}
	        case "8": if(sellpos.equals("buying")) { story.itemused(7);break;}else{story.itemsold(7);break;}
	        case "9": if(sellpos.equals("buying")) { story.itemused(8);break;}else{story.itemsold(8);break;}
	        case "10": if(sellpos.equals("buying")) { story.itemused(9);break;}else{story.itemsold(9);break;}
	        case "shop":{ 
                   if(shopstatus.equals("close")) {
	        		ui.plyr.setVisible(true);
	        		ui.cafeshop.setVisible(true);
	        		shopstatus="open";
	        		}
   	        	else if(shopstatus.equals("open")) {
	        		ui.plyr.setVisible(false);
   	        		ui.cafeshop.setVisible(false);
	        		shopstatus="close";
	        	}
                   }//shop case
	        case"-1i": break;
	        case"item1":story.buyitemcafe(1);break;
	        case"item2":story.buyitemcafe(2);break;
	        case"item3":story.buyitemcafe(3);break;
	        case"item4":story.buyitemcafe(4);break;
	        case"item5":story.buyitemcafe(5);break;
		   
	   
	       case "rshop":{ 
               if(rshopstatus.equals("close")) {
        		
            	
        		ui.ripshpbtnpnl.setVisible(true);
        		rshopstatus="open";
        		}
	        	else if(rshopstatus.equals("open")) {
	        		ui.ripshpbtnpnl.setVisible(false);
        		rshopstatus="close";
        	}
               }//Shop case
        case"-1a": break;
        case"a1":story.buyitemdoc("a1");break;
        case"a2":story.buyitemdoc("a2");break;
        case"a3":story.buyitemcafe(3);break;
        case"a4":story.buyitemcafe(4);break;
        case"a5":story.buyitemcafe(5);break;
        case"sell":{ 
            if(sellpos.equals("buying")) {
            	ui.selltab.setText("selling");	
     		ui.selltab.setVisible(true);
     		ui.invtpnl.setVisible(true);
     	
     		sellpos="selling";
     		}
	        	else if(sellpos.equals("selling")) {
	        	    ui.selltab.setText(" ");
	        		sellpos="buying";
	        		ui.selltab.setVisible(false);
	        		ui.invtpnl.setVisible(false);
	        	}
	       }
        case "stall": break;
        case "combat":story.combat();vm.tocombat();break;
	   } 
		   }
//=============================================================================
	   }
	   public class InfoHandler implements ActionListener{
		   public void actionPerformed(ActionEvent event) {
	        String YourChoice = event.getActionCommand();
	         
	        switch(YourChoice) { 
	        case "a1":ui.text="Augments Boost stats making you better in combat"; ui.textprep();break;
	        case "a2": ui.text ="Increases Acurracy"; ui.textprep();break;
	        case "a3": ui.text ="Titanium reinforcements makes you a living tank";ui.textprep();break;
	        case "c1": {  story.playerattack();break; }
	        case "c2":{ vm.tocontracts();break;}
	        }
		   }
	   }
	   public class   MouseHandle implements MouseListener{
		   @Override
		   public void mouseClicked(MouseEvent e) {
			   if(story.combatpos=="monster"||story.combatpos!= "player") {
					
				   story.monsterattack();
				   
			   }
			 }
		 @Override 
		 public void  mouseReleased(MouseEvent e) {
			 if(story.combatpos=="monster"||story.combatpos!= "player") {
					
				   story.monsterattack();
				   
			   }
			
		 }
		 @Override 
		 public void  mousePressed(MouseEvent e) {
			 if(story.combatpos=="monster"||story.combatpos!= "player") {
				
				   story.monsterattack();
				   
			   }
			 
		 }
		 @Override 
		 public void  mouseEntered (MouseEvent e) {
			 
		 }
		 @Override 
		 public void  mouseExited(MouseEvent e) {
			 
		 }
	   }
	   	        
}//of main class