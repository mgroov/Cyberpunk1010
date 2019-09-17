package Package01;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import Weapons.*;
import x_monsters.*;
import z_Items.*;

public class Storyclass {
    cyberpunk1010 cyber;
    UI ui;
    VisibilityManager vm;
    Player player= new Player();
    String invtstatus = "close";
    String shopstatus ="close";
    SuperMonster monster;
    int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    String decision = "attack";
    int tmpdmg = 0 ;
    int tmpdmg1 =0;
    String combatpos = "player";
    //items / augments --------------------------------------------------
    SuperItem[] playeritem = new SuperItem[10];
    Item_empty empty = new Item_empty();
    Item_stimpack stimpack = new Item_stimpack();
    item_coffee coffee = new item_coffee();
    item_augment1 augment = new item_augment1();
    item_sandwich sandwhich = new item_sandwich();
    item_cake cake =new item_cake();
    item_icedtea tea = new item_icedtea();
    item_titaniumskin tskin = new item_titaniumskin();
    
    
    //---------------------------------------------------------------------
    int dungeon[][]= new int[7][7];
    int playerpos[][]= new int[7][7];
    //-------------------------------------------------------------------
	public Storyclass(cyberpunk1010 c,UI userinterface, VisibilityManager vManager){
	  cyber=c;
	  ui= userinterface;
	  vm=vManager;
  }

   public void defaultSetup() {
	   player.ac=15;
	   player.hp=10;
	   player.MaxHp=10;
	   ui.hpln.setText(""+player.hp);
       
	   player.currentweapon=new WeaponPistol();
       ui.wpln.setText(player.currentweapon.name);
       
       player.attackbonus=7;
       
       player.eddies=50;
       ui.edcl.setText(""+player.eddies);
       
       playeritem[0]=stimpack;
       playeritem[1]=stimpack;
       playeritem[2]=empty;
       playeritem[3]=empty;
       playeritem[4]=empty;
       playeritem[5]=empty;
       playeritem[6]=empty;
       playeritem[7]=empty;
       playeritem[8]=empty;
       playeritem[9]=empty;
       }
    
  
    public void loadPlayerData() {
    	   playeritem[0]=stimpack;
           playeritem[1]=stimpack;
           playeritem[2]=empty;
           playeritem[3]=empty;
           playeritem[4]=empty;
           playeritem[5]=empty;
           playeritem[6]=empty;
           playeritem[7]=empty;
           playeritem[8]=empty;
           playeritem[9]=empty;
    	
    	 ui.ibtn1.setText(playeritem[0].itemname);
    	 ui.ibtn2.setText(playeritem[1].itemname);
    	 ui.ibtn3.setText(playeritem[2].itemname);
    	 ui.ibtn4.setText(playeritem[3].itemname);
    	 ui.ibtn5.setText(playeritem[4].itemname);
    	 ui.ibtn6.setText(playeritem[5].itemname);
    	 ui.ibtn7.setText(playeritem[6].itemname);
    	 ui.ibtn8.setText(playeritem[7].itemname);
    	 ui.ibtn9.setText(playeritem[8].itemname);
    	 ui.ibtn10.setText(playeritem[9].itemname);
    	  int cs=0;
    	try {
    		BufferedReader br = new BufferedReader(new FileReader("SaveFile.txt"));
    		player.ac =Integer.parseInt(br.readLine());
    		player.hp =Integer.parseInt(br.readLine());
    		player.MaxHp = Integer.parseInt(br.readLine());
    		
    	    cs=Integer.parseInt(br.readLine());
    	    
    		player.attackbonus=Integer.parseInt(br.readLine());
    		player.eddies=Integer.parseInt(br.readLine());
    	 
    		s1=Integer.parseInt(br.readLine());
    		s2=Integer.parseInt(br.readLine());
    		s3=Integer.parseInt(br.readLine());
    		s4=Integer.parseInt(br.readLine());
    		s5=Integer.parseInt(br.readLine());
    		s6=Integer.parseInt(br.readLine());
    		s7=Integer.parseInt(br.readLine());
    		s8=Integer.parseInt(br.readLine());
    		s9=Integer.parseInt(br.readLine());
    		s10=Integer.parseInt(br.readLine());
    	   
    		br.close();
    	
    	
    	}
       catch (Exception e) {
    	   
       }
    	switch(cs) {
    	case 1:  player.currentweapon=new Weapon_Shotgun(); ui.wpln.setText(player.currentweapon.name);break;
    	case 0:  player.currentweapon=new WeaponPistol(); ui.wpln.setText(player.currentweapon.name); break;
    	
    	}
    	
    	setitm(s1,0);
    	setitm(s2,1);
    	setitm(s3,2);
    	setitm(s4,3);
    	setitm(s5,4);
    	setitm(s6,5);
    	setitm(s7,6);
    	setitm(s8,7);
    	setitm(s9,8);
    	setitm(s10,9);

    	
    	ui.hpln.setText(""+player.hp);
    	ui.edcl.setText(""+player.eddies);
    	 
    }
    public void savePlayerData() {
	  
    	try {
    		BufferedWriter bw = new BufferedWriter(new FileWriter("SaveFile.txt"));
    		
    		bw.write(""+player.ac);
    		bw.newLine();
    		bw.write(""+player.MaxHp);
    		bw.newLine();
    		bw.write(""+player.hp);
    		bw.newLine();
    		bw.write(""+player.currentweapon.refrence);
    		bw.newLine();
    		bw.write(""+player.attackbonus);
    		bw.newLine();
    		bw.write(""+player.eddies);
    		bw.newLine();
    		bw.write(""+playeritem[0].irefrence);
    		bw.newLine();
    		bw.write(""+playeritem[1].irefrence);
    		bw.newLine();
    		bw.write("" +playeritem[2].irefrence);
    		bw.newLine();
    		bw.write(""+playeritem[3].irefrence);
    		bw.newLine();
    		bw.write(""+playeritem[4].irefrence);
    		bw.newLine();
    		bw.write("" +playeritem[5].irefrence);
    		bw.newLine();
    		bw.write(""+playeritem[6].irefrence);
    		bw.newLine();
    		bw.write(""+playeritem[7].irefrence);
    		bw.newLine();
    		bw.write(""+playeritem[8].irefrence);
    		bw.newLine();
    		bw.write(""+playeritem[9].irefrence);
    	    bw.close();
    	}
       catch(Exception e) {
    	   
       }
    	
    }
      public void aprt() {
    	 
    
    	  ui.hpln.setText(""+player.hp);
      	  ui.edcl.setText(""+player.eddies);  
      }
     public void sleep() {
    	 player.hp=player.MaxHp;
    	  ui.hpln.setText(""+player.hp);
    	 ui.text = "you sleep somewhat full hp restored";
    	 ui.textprep();
    	  
     }
     public void itemused(int slotnumber) {
    	 player.hp=player.hp + playeritem[slotnumber].Healvalue;
    	 player.ac=player.ac+ playeritem[slotnumber].acbonus;//armor class
    	 player.attackbonus = player.attackbonus + playeritem[slotnumber].hitplus;//to hit 
    	 player.MaxHp = player.MaxHp + playeritem[slotnumber].increasemax;
    	
    	 if(player.hp>player.MaxHp) {
    		player.hp=player.MaxHp;
    	}
    	 
    	 ui.hpln.setText(""+player.hp);
    	 
    	 playeritem[slotnumber]= empty;
    	 ui.ibtn1.setText(playeritem[0].itemname);
    	 ui.ibtn2.setText(playeritem[1].itemname);
    	 ui.ibtn3.setText(playeritem[2].itemname);
    	 ui.ibtn4.setText(playeritem[3].itemname);
    	 ui.ibtn5.setText(playeritem[4].itemname);
    	 ui.ibtn6.setText(playeritem[5].itemname);
    	 ui.ibtn7.setText(playeritem[6].itemname);
    	 ui.ibtn8.setText(playeritem[7].itemname);
    	 ui.ibtn9.setText(playeritem[8].itemname);
    	 ui.ibtn10.setText(playeritem[9].itemname);
     }
    public void buyitemcafe(int itembought) {
    	
    	int slotber = 0;
    	while(playeritem[slotber] != empty && slotber < 9) {
    		slotber++;
    	}
        if(playeritem[slotber]==empty) {
        	switch (itembought){
        	case 1 : {
        		if(player.eddies>=stimpack.buyingprice) {
        			playeritem[slotber]= stimpack;
        			player.eddies = player.eddies - stimpack.buyingprice;
        			  ui.edcl.setText(""+player.eddies);  
        			  ui.text="Thank you for your purchase!!!";
        			  ui.textprep();
        			  break;
        		}
        		else {
        			ui.text = "Error 404 money not found";
        			ui.textprep();
        			break;
        		}
        	}//case one 
        	case 2: {
           		if(player.eddies>=coffee.buyingprice) {
         			playeritem[slotber]= coffee;
         			player.eddies = player.eddies/2;
         			  ui.edcl.setText(""+player.eddies);  
         			  ui.text="Thank you for your purchase!!!";
         			  ui.textprep();
         			  break;
         		}
         		else {
         			ui.text = "Error 404 money not found";
         			ui.textprep();
         			break;
         		}
        	}
        	case 3: {
           		if(player.eddies>=sandwhich.buyingprice) {
         			playeritem[slotber]= sandwhich;
         			player.eddies = player.eddies-sandwhich.buyingprice;
         			  ui.edcl.setText(""+player.eddies);  
         			  ui.text="is that blood?";
         			  ui.textprep();
         			  break;
         		}
         		else {
         			ui.text = "Error 404 anteiku not found";
         			ui.textprep();
         			break;
         		}}
        	case 4: {
           		if(player.eddies>=cake.buyingprice) {
         			playeritem[slotber]= cake;
         			player.eddies = player.eddies-cake.buyingprice;
         			  ui.edcl.setText(""+player.eddies);  
         			  ui.text="The Cake is a lie";
         			  ui.textprep();
         			  break;
         		}
         		else {
         			ui.text = "Error 404 glados not found";
         			ui.textprep();
         			break;
         		}}
        	case 5: {
           		if(player.eddies>=tea.buyingprice) {
         			playeritem[slotber]= tea;
         			player.eddies = player.eddies-tea.buyingprice;
         			  ui.edcl.setText(""+player.eddies);  
         			  ui.text="The Developers Favorite";
         			  ui.textprep();
         			  break;
         		}
         		else {
         			ui.text = "Its a sad day when you cant afford tea";
         			ui.textprep();
         			break;
         		}
        	}//switch item bought
        }}
        else if(playeritem[slotber]!=empty) {
         ui.text= "There is a time and place for everything but not in your inventory";
         ui.mtxt.setFont(ui.invFont);
         ui.textprep();
        }
    
     }//of buy item
    public void setitm(int name, int pos) {
    	int refrence = name;
    	switch (refrence) {
    	case -1: break;
    	case 0: playeritem[pos]=empty; break;
    	case 1: playeritem[pos]=stimpack;break;
    	case 2: playeritem[pos]=coffee;break;
    	case 3: playeritem[pos]=augment;break;
    	case 4: playeritem[pos]=sandwhich; break;
    	case 5: playeritem[pos]=cake; break;
    	case 6: playeritem[pos]=tea;break;
    	case 7: playeritem[pos]=tskin;break;
    	
    	}
    }
    public void buyitemdoc(String itembought) {
    	
    	int slotber = 0;
    	while(playeritem[slotber] != empty && slotber < 9) {
    		slotber++;
    	}
        if(playeritem[slotber]==empty) {
        	switch (itembought){
        	case "a1" : {
        		if(player.eddies>=augment.buyingprice) {
        			playeritem[slotber]= augment;
        			player.eddies = player.eddies - augment.buyingprice;
        			  ui.edcl.setText(""+player.eddies);  
        			  ui.text="Commencing upgrade";
        			  ui.textprep();
        			  break;
        		}
        		else {
        			ui.text = "Try to |get a grip| on that money";
        			ui.textprep();
        			break;
        		}
        	}//case one 
        	case "a2": {
           		if(player.eddies>=tskin.buyingprice) {
         			playeritem[slotber]= tskin;
         			player.eddies = player.eddies-tskin.buyingprice;
         			  ui.edcl.setText(""+player.eddies);  
         			  ui.text="You are gonna feel this one";
         			  ui.textprep();
         			  break;
         		}
         		else {
         			ui.text = "I dont give that stuff away";
         			ui.textprep();
         			break;
         		}
        	
        	
        	}//switch item bought
        }}
        else if(playeritem[slotber]!=empty) {
         ui.text= "There is a time and place for everything but not in your inventory";
         ui.mtxt.setFont(ui.invFont);
         ui.textprep();
        }
}
    public void itemsold(int slotnumber) {
   	 player.eddies = player.eddies + playeritem[slotnumber].sellprice;
   	 
   	 ui.edcl.setText(""+player.eddies);  
   	
   	 
   	 playeritem[slotnumber]= empty;
   	 ui.ibtn1.setText(playeritem[0].itemname);
   	 ui.ibtn2.setText(playeritem[1].itemname);
   	 ui.ibtn3.setText(playeritem[2].itemname);
   	 ui.ibtn4.setText(playeritem[3].itemname);
   	 ui.ibtn5.setText(playeritem[4].itemname);
   	 ui.ibtn6.setText(playeritem[5].itemname);
   	 ui.ibtn7.setText(playeritem[6].itemname);
   	 ui.ibtn8.setText(playeritem[7].itemname);
   	 ui.ibtn9.setText(playeritem[8].itemname);
   	 ui.ibtn10.setText(playeritem[9].itemname);
    }

 public void combat() {
	int monsternum = (int)  Math.random()*1+1;
	 combatpos = "player";
	  switch(monsternum) {
	  case 1:{monster= new Monster_base();}
	  case 2:{monster = new Monster_base();}
	  }
	  
	 ui.text = "A "+ monster.name + " appeared";
	 ui.textprep();
	 ui.mimghandle(monster.imgname);
	 ui.mimgpnl.setVisible(true);
	 
 }
 public void playerattack() {
	 int playerroll =(int) (Math.random()*19+1);
	 if(playerroll==20) {
		 tmpdmg = ( player.currentweapon.damage + (int)(Math.random()*player.currentweapon.range))*2;
		 ui.text="it was super effective!! " + monster.name + "took " + tmpdmg +" dmg";
		 ui.textprep();
		 monster.hp = monster.hp-tmpdmg;
		 healthcheck();
		vm.monsterattacks();
		 combatpos="monster";
		
		 
	}
		
	else if((playerroll+player.attackbonus)>=(13+monster.acm)) {
		 tmpdmg=player.currentweapon.damage +  (int)(Math.random()*player.currentweapon.range);
		 ui.text="you hit the " + monster.name + " with " + "" + tmpdmg + " dmg";
		 ui.textprep();
		 monster.hp=monster.hp-tmpdmg;
		 healthcheck();
		
		 combatpos="monster";
			vm.monsterattacks();
		
	  }
	 else if(playerroll==1) {
		 critfail();
		
		 combatpos="monster";
			vm.monsterattacks();
		
		 
	 }
	 else {
		 mockplayer();
		
		 combatpos="monster";
			vm.monsterattacks();
		
	 }
	
 }
 public void monsterattack() {
	 int monsterroll =(int) (Math.random()*19);
	 if(monsterroll==20) {
		 tmpdmg = ( monster.Damage+ (int)(Math.random()*monster.Range))*2;
		 ui.text="it was super effective!! " + " you took " + tmpdmg +" dmg";
		 ui.textprep();
		 player.hp = player.hp-tmpdmg;
		 healthcheck();
		 if(player.hp>0) {
		 combatpos="player";
		 vm.playerattacks();
		 }
		 
	}
		
	else if((monsterroll + monster.attackbonus)>=(player.ac)) {
		tmpdmg = ( monster.Damage+ (int)(Math.random()*monster.Range));
		 ui.text=" " + " you took " + tmpdmg +" dmg";
		 ui.textprep();
		 player.hp = player.hp-tmpdmg;
		 healthcheck();
		 if(player.hp>0) {
		 combatpos="player";
		 vm.playerattacks();
		 }
		 
	  }
	 else if(monsterroll==1) {
		 tmpdmg=player.currentweapon.damage +  (int)(Math.random()*player.currentweapon.range);
		 ui.text="The  " + monster.name + "  hit itself with " + "" + tmpdmg + " dmg";
		 ui.textprep();
		 monster.hp=monster.hp-tmpdmg;
		 healthcheck();
		 if(player.hp>0) {
		 combatpos="player";
		 vm.playerattacks();
		
		 }
		 
	 }
	 else {
		 ui.text="the "+ monster.name + " missed";
		 ui.textprep();
		 combatpos="player";
		 vm.playerattacks();
		
	 }
	
 }
 public void mockplayer() {
	 int mckvalue = (int)(Math.random()*5+1);
	 switch(mckvalue) {
	 case 1:{ ui.text = "Annnnd you Fail";ui.textprep();break;} 
	 case 2:{ ui.text = "Fell asleep on the job maybe";ui.textprep();break;}
	 case 3:{ ui.text = "you missed like a boss";ui.textprep();break;}
	 case 4:{ ui.text = "your weapon has no power in this realm";ui.textprep();break;}
	 case 5:{ ui.text = "you did good if you wished to miss";ui.textprep();break;}
	 case 6:{ ui.text = "Good job you missed";ui.textprep();break;}
	 }
 }
 public void critfail() {
	 tmpdmg = ( player.currentweapon.damage + (int)(Math.random()*player.currentweapon.range));
	 player.hp = player.hp - tmpdmg;
	 healthcheck();
	 ui.hpln.setText(""+player.hp);
	 
	 int mcksvalue = (int)(Math.random()*5+1);
	 switch(mcksvalue) {
	 case 1:{ ui.text = "You literally shot yourself minus" + tmpdmg + " hp";ui.textprep();break;} 
	 case 2:{ ui.text = "Remember it gets better minus " + tmpdmg + " hp";ui.textprep();break;}
	 case 3:{ ui.text = "You stare down the barrel minus" + tmpdmg + " hp";ui.textprep();break;}
	 case 4:{ ui.text = "You miss summoning cuthulu minus" + tmpdmg + " hp";ui.textprep();break;}
	 case 5:{ ui.text = "You missed the cast of critical role minus" + tmpdmg + " hp";ui.textprep();break;}
	 case 6:{ ui.text = "You trip on nothing minus" + tmpdmg + " hp";ui.textprep();break;}
	 }
 
 }
public void monsterdefeat() {
	player.exp=player.exp+monster.expval;
	ui.text ="the " + monster.name+" was defeated you got " + "" + monster.expval + " exp";
	combatpos  = "monster";
	vm.monsterattacks();
	ui.textprep();
	levelhandle();
	vm.tocontracts();
}
public void healthcheck() {
	if(monster.hp<=0) {monsterdefeat();}
	if(player.hp<=0) {playerdefeat();}
	ui.hpln.setText(""+player.hp);
}

public void playerdefeat() {
	combatpos = "monster";
	vm.monsterattacks();
	vm.tocontracts();
	ui.text="you were beaten you were revived your money was taken";
	vm.tocontracts();
	ui.textprep();
	player.hp=player.MaxHp;
	
	
}
public void levelhandle() {
	switch(player.exp) {
	case 100:{
		player.MaxHp=player.MaxHp+10;
		player.hp = player.MaxHp;
		ui.hpln.setText(""+player.hp);
		ui.text="you reached level one";
		ui.textprep();
	}
	case 500:{
		player.MaxHp=player.MaxHp+10;
		player.hp = player.MaxHp;
		ui.hpln.setText(""+player.hp);
		ui.text="you reached level two";
		ui.textprep();
	}
	case 1000:{
		player.MaxHp=player.MaxHp+15;
		player.hp = player.MaxHp;
		ui.hpln.setText(""+player.hp);
		ui.text="you reached level three";
		ui.textprep();
	}
	}
}
}



