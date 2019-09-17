package Package01;
import javax.swing.*;

import Package01.cyberpunk1010.ChoiceHandler;
import Package01.cyberpunk1010.InfoHandler;
import Package01.cyberpunk1010.InventoryHandler;
import Package01.cyberpunk1010.MouseHandle;
import Package01.cyberpunk1010.TitleHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.awt.*;

public class UI {
	 JFrame window;
	  JPanel mtxt,title,strtbtn,strtimp,ncimp,chcbtn,chcbtn2,chcbtn3,chcbtn4,plyr,cimp,loadbuttonpnl,invtpnl,sellpnl,cnimgpnl,mimgpnl;
	  JPanel rtbp,aimgpnl,savebtnpnl,rimgpnl,opnclsinv,sleepbtnpnl,cafeshppnl,cafeshpbtnpnl,cafeshop,ripshppnl,ripshpbtnpnl,testcombatpnl;
	  JPanel combatbtnpnl;
	  JLabel mnimg;
	  
	  JLabel titlel,hpl,hpln,wpl,wpln,edc,edcl,pl,pln,selltab;
	  JLabel startim,ncim,cim,aimg,dimg,cnimg;
	  JLabel csi1,csi2,csi3,csi4,csi5;
	  JLabel rsi1,rsi2,rsi3,rsi4,rsi5,rsi6;
	
	  JButton strt,ch1,ch2,ch3,ch4,rtn,load,save,sleep,cafeshp,ripshp,sellb,tstcmbt;
	  JButton ibtn1,ibtn2,ibtn3,ibtn4,ibtn5,ibtn6,ibtn7,ibtn8,ibtn9,ibtn10,invc;
	  JButton shbtn1,shbtn2,shbtn3,shbtn4,shbtn5,infbtn1,infbtn2,infbtn3,infbtn4,infbtn5,infbtn6;
	  JButton rshbtn1,rshbtn2,rshbtn3,rshbtn4,rshbtn5,atack,retreat;
	  
	  String text;
	  int i=0;
	  
	  ImageIcon start,startimg,cafeimg,apartimg,Docimg,conimg,mimg;
	    
	  Timer timer = new Timer(80,new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent e){
			  char charachter[]= text.toCharArray();
		      int arraynumber = charachter.length;
		      
		      String addedcharachter;
		      String blank ="";
		      
		      addedcharachter = blank + charachter[i];
              maintext.append(addedcharachter);
              
              i++;
		 if(i==arraynumber) {
			i=0;
			timer.stop();
		 }
		  }
	  });
	  
	  JTextArea maintext;
	
	  Font titleFont = new Font("Chintzy CPU Shadow BRK", Font.BOLD, 78);
	   Font normalFont = new Font("Chintzy CPU Shadow BRK", Font.BOLD, 50);
	   Font textFont = new Font("Chintzy CPU Shadow BRK", Font.BOLD, 45);
	   Font statsFont  = new Font("Chintzy CPU Shadow BRK", Font.BOLD, 30);
	   Font invFont  = new Font("COALITION", Font.BOLD, 25);
	   public void createUI(ChoiceHandler chandler,TitleHandler thandle, InventoryHandler ihandle, InfoHandler inhandle, MouseHandle mhandle) {
	 //screen creation '
	  window = new JFrame();
	  window.setSize(1920,1080);
	  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  window.getContentPane().setBackground(Color.black);
	  window.setLayout(null);
	  window.addMouseListener(mhandle);
	 
     
	  mtxt = new JPanel();
      mtxt.setBounds(100,20,1500,50);
      mtxt.setBackground(Color.black);
      window.add(mtxt);
   
      maintext = new JTextArea("I hate you please leave");
      maintext.setBounds(0,0,1480,350);
      maintext.setBackground(Color.black);
      maintext.setForeground(Color.cyan);
      maintext.setFont(textFont);
      maintext.setLineWrap(true); 
      mtxt.add(maintext);
	 
      
      
	  //title image 

      loadbuttonpnl = new JPanel();
      loadbuttonpnl .setBounds(300,500,200,100);
      loadbuttonpnl .setBackground(Color.black);
      loadbuttonpnl .setOpaque(false);
      
      testcombatpnl = new JPanel();
      testcombatpnl .setBounds(0,100,500,100);
      testcombatpnl .setBackground(Color.black);
      testcombatpnl .setOpaque(false);
      
      tstcmbt = new JButton("Test combat");
      tstcmbt.setBackground(Color.black);
      tstcmbt.setForeground(Color.magenta);
      tstcmbt.setFont(normalFont);
      tstcmbt.setBorder(null);
      tstcmbt.addActionListener(ihandle);
      tstcmbt.setActionCommand("combat");
      tstcmbt.setFocusPainted(false);
      testcombatpnl.add(tstcmbt); 
      
	  window.add(testcombatpnl);
    		  
      load = new JButton("Load");
      load.setBackground(Color.black);
      load.setForeground(Color.magenta);
      load.setFont(normalFont);
      load.setBorder(null);
      load.addActionListener(thandle);
      load.setActionCommand("load");
      load.setFocusPainted(false);
      loadbuttonpnl.add(load); 
	  window.add(loadbuttonpnl);
	 
      
	  //Title Screen 
	  title = new JPanel();
      title.setBounds(200,20,950,150);//(x,y,width, height)
      title.setBackground(Color.black);
      title.setOpaque(false);
      titlel = new JLabel("CyberPunk 1010");
      titlel.setForeground(Color.cyan);
      titlel.setFont(titleFont);
      title.add(titlel);
      
      
      strtbtn = new JPanel();
      strtbtn.setBounds(400,400,200,100);
      strtbtn.setBackground(Color.black);
      strtbtn.setOpaque(false);
      
      strt = new JButton("Enter");
      strt.setBackground(Color.black);
      strt.setForeground(Color.magenta);
      strt.setFont(normalFont);
      strt.setBorder(null);
      strt.addActionListener(thandle);
      strt.setActionCommand("start");
      strt.setFocusPainted(false);
      strtbtn.add(strt); 
      
      window.add(strtbtn);
      window.add(title);
  
	  
       cafeshppnl = new JPanel();
       cafeshppnl.setBounds(700,750,325,150);
       cafeshppnl.setBackground(Color.black);
       cafeshppnl.setOpaque(false);
        
       cafeshp = new JButton("Cafe Menu");
       cafeshp.setBackground(Color.black);
       cafeshp.setForeground(Color.cyan);
       cafeshp.setFont(normalFont);
       cafeshp.setFocusPainted(false);
       cafeshp.addActionListener(ihandle);
       cafeshp.setActionCommand("shop");
       cafeshppnl.add(cafeshp); 
       window.add(cafeshppnl);  
       
       cafeshppnl.setVisible(false);
       
       cafeshop = new JPanel();
       cafeshop.setBounds(50,125,450,300);
       cafeshop.setBackground(Color.black);
       cafeshop.setLayout(new GridLayout(6,2));
      
       csi1 = new JLabel(" Item");
       csi1.setFont(statsFont);
       csi1.setForeground(Color.orange);
       cafeshop.add(csi1);
       
       csi1 = new JLabel(" Cost:");
       csi1.setFont(statsFont);
       csi1.setForeground(Color.orange);
       cafeshop.add(csi1);
       
       shbtn1 = new JButton("Stimpack");
       shbtn1.setBackground(Color.black);
       shbtn1.setForeground(Color.white);
       shbtn1.setFont(invFont);
       shbtn1.setFocusPainted(false);
       shbtn1.addActionListener(ihandle);
       shbtn1.setActionCommand("item1");
       cafeshop.add(shbtn1); 
       
       csi1 = new JLabel(" 40");
       csi1.setFont(statsFont);
       csi1.setForeground(Color.cyan);
       cafeshop.add(csi1);
       
       shbtn2 = new JButton("Coffee");
       shbtn2.setBackground(Color.black);
       shbtn2.setForeground(Color.white);
       shbtn2.setFont(invFont);
       shbtn2.setFocusPainted(false);
       shbtn2.addActionListener(ihandle);
       shbtn2.setActionCommand("item2");
       cafeshop.add(shbtn2); 
       
       csi2 = new JLabel(" TOO MUCH");
       csi2.setFont(statsFont);
       csi2.setForeground(Color.orange);
       cafeshop.add(csi2);
       
       shbtn3 = new JButton("Sandwich");
       shbtn3.setBackground(Color.black);
       shbtn3.setForeground(Color.white);
       shbtn3.setFont(invFont);
       shbtn3.setFocusPainted(false);
       shbtn3.addActionListener(ihandle);
       shbtn3.setActionCommand("item3");
       cafeshop.add(shbtn3);
       
       csi3 = new JLabel(" 5 ");
       csi3.setFont(statsFont);
       csi3.setForeground(Color.cyan);
       cafeshop.add(csi3);
       
       shbtn4 = new JButton("Cake");
       shbtn4.setBackground(Color.black);
       shbtn4.setForeground(Color.white);
       shbtn4.setFont(invFont);
       shbtn4.setFocusPainted(false);
       shbtn4.addActionListener(ihandle);
       shbtn4.setActionCommand("item4");
       cafeshop.add(shbtn4); 
       
       csi4 = new JLabel(" 50 + some tests");
       csi4.setFont(statsFont);
       csi4.setForeground(Color.cyan);
       cafeshop.add(csi4);
       
       shbtn5 = new JButton("IcedTea");
       shbtn5.setBackground(Color.black);
       shbtn5.setForeground(Color.white);
       shbtn5.setFont(invFont);
       shbtn5.setFocusPainted(false);
       shbtn5.addActionListener(ihandle);
       shbtn5.setActionCommand("item5");
       cafeshop.add(shbtn5); 
       
       csi5= new JLabel(" 5");
       csi5.setFont(statsFont);
       csi5.setForeground(Color.cyan);
       cafeshop.add(csi5);
       
       window.add(cafeshop);
       cafeshop.setVisible(false);
    	  
       sellpnl = new JPanel();
       sellpnl.setBounds(1100,750,325,150);
       sellpnl.setBackground(Color.black);
       sellpnl.setOpaque(false);
       
       sellb = new JButton("sell");
       sellb.setBackground(Color.black);
       sellb.setForeground(Color.magenta);
       sellb.setFont(normalFont);
       sellb.setFocusPainted(false);
       sellb.addActionListener(ihandle);
       sellb.setActionCommand("sell");
       sellpnl.add(sellb); 
       
       selltab = new JLabel(" ");
       selltab.setFont(statsFont);
       selltab.setForeground(Color.orange);
       sellpnl.add(selltab);
       
       window.add(sellpnl);
       selltab.setVisible(false);
       sellpnl.setVisible(false);
       
       
       
       ripshppnl = new JPanel();
       ripshppnl.setBounds(700,750,325,150);
       ripshppnl.setBackground(Color.black);
       ripshppnl.setOpaque(false);
        
       ripshp = new JButton("Augments");
       ripshp.setBackground(Color.black);
       ripshp.setForeground(Color.red);
       ripshp.setFont(normalFont);
       ripshp.setFocusPainted(false);
       ripshp.addActionListener(ihandle);
       ripshp.setActionCommand("rshop");
       ripshppnl.add(ripshp); 
       window.add(ripshppnl);  
       
       ripshppnl.setVisible(false);
       
       ripshpbtnpnl = new JPanel();
       ripshpbtnpnl.setBounds(50,175,950,500);
       ripshpbtnpnl.setBackground(Color.black);
       ripshpbtnpnl.setLayout(new GridLayout(6,3));
      
       rsi1 = new JLabel(" AUGMENT");
       rsi1.setFont(statsFont);
       rsi1.setForeground(Color.cyan);
       ripshpbtnpnl.add(rsi1);
     
       
       rsi1 = new JLabel(" Cost:");
       rsi1.setFont(statsFont);
       rsi1.setForeground(Color.orange);
       ripshpbtnpnl.add(rsi1);
       
       infbtn1 = new JButton("INFO >");
       infbtn1.setBackground(Color.black);
       infbtn1.setForeground(Color.red);
       infbtn1.setFont(invFont);
       infbtn1.setFocusPainted(false);
       infbtn1.addActionListener(inhandle);
       infbtn1.setActionCommand("a1");
       ripshpbtnpnl.add(infbtn1); 
       
       
       rshbtn1 = new JButton("Pistol Grip");
       rshbtn1.setBackground(Color.black);
       rshbtn1.setForeground(Color.red);
       rshbtn1.setFont(invFont);
       rshbtn1.setFocusPainted(false);
       rshbtn1.addActionListener(ihandle);
       rshbtn1.setActionCommand("a1");
       ripshpbtnpnl.add(rshbtn1);
       
       rsi2 = new JLabel(" 5000 ");
       rsi2.setFont(statsFont);
       rsi2.setForeground(Color.cyan);
       ripshpbtnpnl.add(rsi2);
       
       infbtn2 = new JButton(">");
       infbtn2.setBackground(Color.black);
       infbtn2.setForeground(Color.red);
       infbtn2.setFont(invFont);
       infbtn2.setFocusPainted(false);
       infbtn2.addActionListener(inhandle);
       infbtn2.setActionCommand("a2");
       ripshpbtnpnl.add(infbtn2); 
       
       rshbtn2 = new JButton("Titanum Skin");
       rshbtn2.setBackground(Color.black);
       rshbtn2.setForeground(Color.white);
       rshbtn2.setFont(invFont);
       rshbtn2.setFocusPainted(false);
       rshbtn2.addActionListener(ihandle);
       rshbtn2.setActionCommand("a2");
       ripshpbtnpnl.add(rshbtn2); 
       
       rsi3 = new JLabel(" 6000");
       rsi3.setFont(statsFont);
       rsi3.setForeground(Color.orange);
       ripshpbtnpnl.add(rsi3);
       
       infbtn3 = new JButton(">");
       infbtn3.setBackground(Color.black);
       infbtn3.setForeground(Color.red);
       infbtn3.setFont(invFont);
       infbtn3.setFocusPainted(false);
       infbtn3.addActionListener(inhandle);
       infbtn3.setActionCommand("a3");
       ripshpbtnpnl.add(infbtn3); 
       
       rshbtn3 = new JButton();
       rshbtn3.setBackground(Color.black);
       rshbtn3.setForeground(Color.white);
       rshbtn3.setFont(invFont);
       rshbtn3.setFocusPainted(false);
       rshbtn3.addActionListener(ihandle);
       rshbtn3.setActionCommand("a3");
       ripshpbtnpnl.add(rshbtn3);
       
       rsi4 = new JLabel("PLayer");
       rsi4.setFont(statsFont);
       rsi4.setForeground(Color.cyan);
       ripshpbtnpnl.add(rsi4);
       
       infbtn4 = new JButton(">");
       infbtn4.setBackground(Color.black);
       infbtn4.setForeground(Color.red);
       infbtn4.setFont(invFont);
       infbtn4.setFocusPainted(false);
       infbtn4.addActionListener(inhandle);
       infbtn4.setActionCommand("a4");
       ripshpbtnpnl.add(infbtn4); 
       
       
       shbtn4 = new JButton();
       shbtn4.setBackground(Color.black);
       shbtn4.setForeground(Color.white);
       shbtn4.setFont(invFont);
       shbtn4.setFocusPainted(false);
       shbtn4.addActionListener(ihandle);
       shbtn4.setActionCommand("item4");
       ripshpbtnpnl.add(shbtn4); 
       
       rsi5 = new JLabel("PLayer");
       rsi5.setFont(statsFont);
       rsi5.setForeground(Color.cyan);
       ripshpbtnpnl.add(rsi5);
       
       infbtn5 = new JButton(">");
       infbtn5.setBackground(Color.black);
       infbtn5.setForeground(Color.red);
       infbtn5.setFont(invFont);
       infbtn5.setFocusPainted(false);
       infbtn5.addActionListener(inhandle);
       infbtn5.setActionCommand("a5");
       ripshpbtnpnl.add(infbtn5); 
       
       shbtn5 = new JButton();
       shbtn5.setBackground(Color.black);
       shbtn5.setForeground(Color.white);
       shbtn5.setFont(invFont);
       shbtn5.setFocusPainted(false);
       shbtn5.addActionListener(ihandle);
       shbtn5.setActionCommand("item5");
       ripshpbtnpnl.add(shbtn5); 
       
       rsi6= new JLabel("PLayer");
       rsi6.setFont(statsFont);
       rsi6.setForeground(Color.cyan);
       ripshpbtnpnl.add(rsi6);
       
       infbtn6 = new JButton(">");
       infbtn6.setBackground(Color.black);
       infbtn6.setForeground(Color.red);
       infbtn6.setFont(invFont);
       infbtn6.setFocusPainted(false);
       infbtn6.addActionListener(inhandle);
       infbtn6.setActionCommand("a6");
       ripshpbtnpnl.add(infbtn6); 
       
       
       window.add(ripshpbtnpnl);
       ripshpbtnpnl.setVisible(false);
       
       combatbtnpnl = new JPanel();
       combatbtnpnl.setBounds(510,500,500,250);
       combatbtnpnl.setBackground(Color.black);
       combatbtnpnl.setLayout(new GridLayout(6,3));
       
       atack = new JButton("attack");
       atack.setBackground(Color.black);
       atack.setForeground(Color.red);
       atack.setFont(invFont);
       atack.setFocusPainted(false);
       atack.addActionListener(inhandle);
       atack.setActionCommand("c1");
       combatbtnpnl.add(atack); 
       
       retreat = new JButton("retreat");
       retreat.setBackground(Color.black);
       retreat.setForeground(Color.red);
       retreat.setFont(invFont);
       retreat.setFocusPainted(false);
       retreat.addActionListener(inhandle);
       retreat.setActionCommand("c2");
       combatbtnpnl.add(retreat);
      //Night City Screen
      
      chcbtn = new JPanel();
      chcbtn.setBounds(0,250,170,150);
      chcbtn.setBackground(Color.black);
      chcbtn.setOpaque(false);
   
      ch1 = new JButton("Cafe");
      ch1.setBackground(Color.black);
      ch1.setForeground(Color.magenta);
      ch1.setFont(normalFont);
      ch1.setFocusPainted(false);
      ch1.addActionListener(chandler);
      ch1.setActionCommand("c1");
      chcbtn.add(ch1);
   
      chcbtn2 = new JPanel();
      chcbtn2.setBounds(1150,250,400,150);
      chcbtn2.setBackground(Color.black);
      chcbtn2.setOpaque(false);
      
      
      ch2 = new JButton("Contracts");
      ch2.setBackground(Color.black);
      ch2.setForeground(Color.red);
      ch2.setFont(normalFont);
      ch2.setFocusPainted(false);
      ch2.addActionListener(chandler);
      ch2.setActionCommand("c2");
      chcbtn2.add(ch2); 
    
       
      chcbtn3 = new JPanel();
      chcbtn3.setBounds(0,350,325,150);
      chcbtn3.setBackground(Color.black);
      chcbtn3.setOpaque(false);
      
      ch3 = new JButton("Apartment");
      ch3.setBackground(Color.black);
      ch3.setForeground(Color.cyan);
      ch3.setFont(normalFont);
      ch3.setFocusPainted(false);
      ch3.addActionListener(chandler);
      ch3.setActionCommand("c3");
      chcbtn3.add(ch3);
      
      savebtnpnl = new JPanel();
      savebtnpnl.setBounds(100,500,525,150);
      savebtnpnl.setBackground(Color.black);
      savebtnpnl.setOpaque(false);
      
      save = new JButton("Save The Game");
      save.setBackground(Color.black);
      save.setForeground(Color.magenta);
      save.setFont(normalFont);
      save.setBorder(null);
      save.addActionListener(chandler);
      save.setActionCommand("save");
      save.setFocusPainted(false);
      savebtnpnl.add(save); 
	  window.add(savebtnpnl);
	  
	  
	  sleepbtnpnl = new JPanel();
	  sleepbtnpnl.setBounds(100,600,525,150);
	  sleepbtnpnl.setBackground(Color.black);
	  sleepbtnpnl.setOpaque(false);
      
      sleep = new JButton("Sleep");
      sleep.setBackground(Color.black);
      sleep.setForeground(Color.cyan);
      sleep.setFont(normalFont);
      sleep.setBorder(null);
      sleep.addActionListener(chandler);
      sleep.setActionCommand("sleep");
      sleep.setFocusPainted(false);
      sleepbtnpnl.add(sleep); 
	  window.add(sleepbtnpnl);
      
   
      chcbtn4 = new JPanel();
      chcbtn4.setBounds(0,450,350,150);
      chcbtn4.setBackground(Color.black);
      chcbtn4.setOpaque(false);
       
      ch4 = new JButton("Ripper-D0C");
      ch4.setBackground(Color.black);
      ch4.setForeground(Color.orange);
      ch4.setFont(normalFont);
      ch4.setFocusPainted(false);
      ch4.addActionListener(chandler);
      ch4.setActionCommand("c4");
      chcbtn4.add(ch4); 
     
      plyr = new JPanel();
      plyr.setBounds(1200,100,350,300);
      plyr.setBackground(Color.black);
      plyr.setLayout(new GridLayout(4,2));
     
      pl = new JLabel("PLayer");
      pl.setFont(statsFont);
      pl.setForeground(Color.orange);
      plyr.add(pl);
      pln = new JLabel("Stats");
      pln.setFont(statsFont);
      pln.setForeground(Color.orange);
      plyr.add(pln);
      hpl = new JLabel("HP:");
      hpl.setFont(statsFont);
      hpl.setForeground(Color.red);
      plyr.add(hpl);
      hpln = new JLabel();
      hpln.setFont(statsFont);
      hpln.setForeground(Color.red);
      plyr.add(hpln);
      wpl = new JLabel("Weapon:");
      wpl.setFont(statsFont);
      wpl.setForeground(Color.red); 
      plyr.add(wpl);
      wpln = new JLabel();
      wpln.setFont(statsFont);
      wpln.setForeground(Color.red);
      plyr.add(wpln);
      edc = new JLabel("Eddies:");
      edc.setFont(statsFont);
      edc.setForeground(Color.red); 
      plyr.add(edc);
      edcl = new JLabel();
      edcl.setFont(statsFont);
      edcl.setForeground(Color.red);
      plyr.add(edcl);
      
      
      
      window.add(plyr);
     
      
      opnclsinv = new JPanel();
      opnclsinv.setBounds(1450,750,50,50);
      opnclsinv.setBackground(Color.black);
      opnclsinv.setOpaque(false);
       
      invc = new JButton("($)");
      invc.setBackground(Color.black);
      invc.setForeground(Color.orange);
      invc.setFont(normalFont);
      invc.setFocusPainted(false);
      invc.addActionListener(ihandle);
      invc.setActionCommand("inventory");
      opnclsinv.add(invc); 
      window.add(opnclsinv);
     
     
      
      invtpnl = new JPanel();
      invtpnl.setBounds(175,600,1250,100);
      invtpnl.setBackground(Color.black);
      invtpnl.setLayout(new GridLayout(2,5));
     
      ibtn1 = new JButton();
      ibtn1.setBackground(Color.black);
      ibtn1.setForeground(Color.white);
      ibtn1.setFont(invFont);
      ibtn1.setFocusPainted(false);
      ibtn1.addActionListener(ihandle);
      ibtn1.setActionCommand("1");
      invtpnl.add(ibtn1); 
      
      ibtn2 = new JButton();
      ibtn2.setBackground(Color.black);
      ibtn2.setForeground(Color.white);
      ibtn2.setFont(invFont);
      ibtn2.setFocusPainted(false);
      ibtn2.addActionListener(ihandle);
      ibtn2.setActionCommand("2");
      invtpnl.add(ibtn2); 
      
      ibtn3 = new JButton();
      ibtn3.setBackground(Color.black);
      ibtn3.setForeground(Color.white);
      ibtn3.setFont(invFont);
      ibtn3.setFocusPainted(false);
      ibtn3.addActionListener(ihandle);
      ibtn3.setActionCommand("3");
      invtpnl.add(ibtn3);
      
      ibtn4 = new JButton();
      ibtn4.setBackground(Color.black);
      ibtn4.setForeground(Color.white);
      ibtn4.setFont(invFont);
      ibtn4.setFocusPainted(false);
      ibtn4.addActionListener(ihandle);
      ibtn4.setActionCommand("4");
      invtpnl.add(ibtn4); 
      
      ibtn5 = new JButton();
      ibtn5.setBackground(Color.black);
      ibtn5.setForeground(Color.white);
      ibtn5.setFont(invFont);
      ibtn5.setFocusPainted(false);
      ibtn5.addActionListener(ihandle);
      ibtn5.setActionCommand("5");
      invtpnl.add(ibtn5); 
      
      ibtn6 = new JButton();
      ibtn6.setBackground(Color.black);
      ibtn6.setForeground(Color.white);
      ibtn6.setFont(invFont);
      ibtn6.setFocusPainted(false);
      ibtn6.addActionListener(ihandle);
      ibtn6.setActionCommand("6");
      invtpnl.add(ibtn6);
      
      
      ibtn7 = new JButton();
      ibtn7.setBackground(Color.black);
      ibtn7.setForeground(Color.white);
      ibtn7.setFont(invFont);
      ibtn7.setFocusPainted(false);
      ibtn7.addActionListener(ihandle);
      ibtn7.setActionCommand("7");
      invtpnl.add(ibtn7);
      
      
      ibtn8 = new JButton();
      ibtn8.setBackground(Color.black);
      ibtn8.setForeground(Color.white);
      ibtn8.setFont(invFont);
      ibtn8.setFocusPainted(false);
      ibtn8.addActionListener(ihandle);
      ibtn8.setActionCommand("8");
      invtpnl.add(ibtn8);
      
      
      ibtn9 = new JButton();
      ibtn9.setBackground(Color.black);
      ibtn9.setForeground(Color.white);
      ibtn9.setFont(invFont);
      ibtn9.setFocusPainted(false);
      ibtn9.addActionListener(ihandle);
      ibtn9.setActionCommand("9");
      invtpnl.add(ibtn9);
      
      
      
      ibtn10 = new JButton();
      ibtn10.setBackground(Color.black);
      ibtn10.setForeground(Color.white);
      ibtn10.setFont(invFont);
      ibtn10.setFocusPainted(false);
      ibtn10.addActionListener(ihandle);
      ibtn10.setActionCommand("10");
      invtpnl.add(ibtn10);
      
      window.add(invtpnl);
      invtpnl.setVisible(false);
      
      
      
      //cafe screen 
      rtbp = new JPanel();
      rtbp.setBounds(0,750,350,150);
      rtbp.setBackground(Color.black);
      rtbp.setOpaque(false);
       
      rtn = new JButton("Return");
      rtn.setBackground(Color.black);
      rtn.setForeground(Color.magenta);
      rtn.setFont(invFont);
      rtn.setFocusPainted(false);
      rtn.addActionListener(chandler);
      rtn.setActionCommand("return");
      rtbp.add(rtn);
      window.add(rtbp);
      
      
     //-----
      window.add(combatbtnpnl);
      window.add(chcbtn); 
      window.add(chcbtn2);
      window.add(chcbtn3);
      window.add(chcbtn3);
      window.add(chcbtn4);
      imghandle("wow.jpg");
      simghandle("Night City.jpg");
      cimghandle("coffee_in_rain_by_kirokaze.jpg");
      aimghandle("apt.jpg");
      rimghandle("Cyberpunk-2077-Ripper-Doc.jpg");
      conimghandle("cyberpunk_by_cuber-d6ydb09.jpg");
      mimghandle("epic duck.jpg");
      window.setVisible(true);
  
	   }//of create UI
   public void imghandle(String img) {
	   start = new ImageIcon(getClass().getClassLoader().getResource(img));
		  
		  strtimp = new JPanel();
		  strtimp.setBounds(0,0,1720,900);
		  startim = new JLabel();
		  startim.setIcon(start);
		  strtimp.add(startim);
		  
		  window.add(strtimp);
		  strtimp.setVisible(false);
		  window.setVisible(true);
   }
   public void simghandle(String img2) {
	   startimg = new ImageIcon(getClass().getClassLoader().getResource(img2));
		  
		  ncimp = new JPanel();
		  ncimp.setBounds(0,0,1720,900);
		  ncim = new JLabel();
		  ncim.setIcon(startimg);
		  ncimp.add(ncim);
          
		  
		  window.add(ncimp);
		  ncimp.setVisible(false);
		  window.setVisible(true);
   } 
   public void cimghandle(String img3) {
	   cafeimg = new ImageIcon(getClass().getClassLoader().getResource(img3));
		  
		  cimp = new JPanel();
		  cimp.setBounds(0,0,1720,900);
		  cim = new JLabel();
		  cim.setIcon(cafeimg);
		  cimp.add(cim);
         
		  window.add(cimp);
		  cimp.setVisible(false);
		  window.setVisible(true);
   } 
   public void aimghandle(String img4) {
	   apartimg = new ImageIcon(getClass().getClassLoader().getResource(img4));
		  
		  aimgpnl = new JPanel();
		  aimgpnl.setBounds(0,0,1720,900);
		  aimg = new JLabel();
		  aimg.setIcon(apartimg);
		  aimgpnl.add(aimg);
         
		  window.add(aimgpnl);
		  aimgpnl.setVisible(false);
		  window.setVisible(true);
   } 
   public void rimghandle(String img5) {
	   Docimg = new ImageIcon(getClass().getClassLoader().getResource(img5));
		  
		  rimgpnl = new JPanel();
		  rimgpnl.setBounds(0,0,1720,900);
		  dimg = new JLabel();
		  dimg.setIcon(Docimg);
		  rimgpnl.add(dimg);
         
		  window.add(rimgpnl);
		  rimgpnl.setVisible(false);
		  window.setVisible(true);
   } 
   public void conimghandle(String img5) {
	   conimg = new ImageIcon(getClass().getClassLoader().getResource(img5));
		  
		  cnimgpnl = new JPanel();
		  cnimgpnl.setBounds(0,0,1720,900);
		  cnimg = new JLabel();
		  cnimg.setIcon(conimg);
		  cnimgpnl.add(cnimg);
         
		  window.add(cnimgpnl);
		  cnimgpnl.setVisible(false);
		  window.setVisible(true);
   } 
   public void textprep() {
	   i=0;
	   maintext.setText(" ");
	   timer.start();
	   }
   public void mimghandle(String img6) {
	  mimg = new ImageIcon(getClass().getClassLoader().getResource(img6));
		  
		  mimgpnl = new JPanel();
		  mimgpnl.setBounds(400,100,500,375);
		  mimgpnl.setOpaque(false);
		  mnimg = new JLabel();
		  mnimg.setIcon(mimg);
		  mimgpnl.add(mnimg);
         
		  window.add(mimgpnl);
		  mimgpnl.setVisible(false);
		  window.setVisible(true);
   } 
}//of class UI
