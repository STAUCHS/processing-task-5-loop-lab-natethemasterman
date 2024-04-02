import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  // Size Call
  public void settings() {
    size(1200, 600);
  }

  // Background Setup
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Call repeatedly
   * Everything draw on screen is here
   */
  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }

    // Dividers for each sections
  public void draw_section_outlines() {
    stroke(0);
    noFill();

    // Bottom Row Boxes
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // Top Row Boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  

  // First Section
  public void draw_section1() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + (intRow * 10);  // Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + (intColumn * 10); // Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Second Section
  public void draw_section2() {
    int intX = 0;
    int intY = 0;
    
    for(int intRow = 0; intRow < 30; intRow ++) {
      for(int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + (intRow * 10 + 300); 
        intY = 3 + 300 + (intColumn * 10);

        if (intColumn % 2 != 0) {
          fill(0);
        }
        else {
          fill(255);
        }
              
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 3
  public void draw_section3() {
    int intX = 0;
    int intY = 0;
  
    for(int intRow = 0; intRow < 30; intRow ++) {
      for(int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + (intRow * 10 + 600);
        intY = 3 + 300 + (intColumn * 10);
  
        if (intRow % 2 == 0){
          fill(0);
        }
        else{
          fill(255);
        }
              
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 4
  public void draw_section4() {
    int intX = 0;
    int intY = 0;
  
    for(int intRow = 0; intRow < 30; intRow ++) {
      for(int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + (intRow * 10 + 900);
        intY = 3 + 300 + (intColumn * 10);
  
        if (intRow % 2 == 0 || intColumn % 2 != 0){
          fill(0);
        }
        else {
          fill(255);
        }
              
        rect(intX, intY, 5, 5);
      }
    }   
  }

  // Section 5
  public void draw_section5() {
    int intX = 0;
    int intY = 0;
  
    for(int intRow = 0; intRow < 30; intRow ++) {
      for(int intColumn = 29 - intRow; intColumn < 30; intColumn++) {
        intX = 3 + (intRow * 10);
        intY = 3 + (intColumn * 10);
        
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 6
  public void draw_section6() {
    int intX = 0;
    int intY = 0;
  
    for(int intRow = 0; intRow < 30; intRow ++) {
      for(int intColumn = intRow + 30; intColumn >= 30; intColumn--) {
        intX = 3 + (intColumn * 10); 
        intY = 3 + (intRow * 10); 
        
        rect(intX, intY, 5, 5);
      }
    } 
  }

  // Section 7
  public void draw_section7() {
    int intX = 0;
    int intY = 0;
  
    for(int intRow = 0; intRow < 30; intRow++) {
      for(int intColumn = 89 - intRow; intColumn >= 60; intColumn--) {
        intX = 3 + (intColumn * 10);  
        intY = 3 + (intRow * 10); 
        
        rect(intX, intY, 5, 5);
      }
    }     
  }
  
  // Section 8
  public void draw_section8() {
    int intX = 0;
    int intY = 0;
  
    for(int intRow = 0; intRow < 30; intRow++) {
      for(int intColumn = intRow + 90; intColumn < 120; intColumn++) {
        intX = 3 + (intColumn * 10);  
        intY = 3 + (intRow * 10);
         
        rect(intX, intY, 5, 5);
      }
    }  
  }
}