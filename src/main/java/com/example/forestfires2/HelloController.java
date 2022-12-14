package com.example.forestfires2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class HelloController {
    long end, start;//time consume
    float execution;
    @FXML
    TextField timeExecution,whileCounterText,squaresBurned,rsquareRandomN;
    @FXML
    Rectangle a,b,c,d,e,f,g,h,i,j,a1,b1,c1,d1,e1,f1,g1;
    @FXML
    Button changeColor;
    int height = 2, width = 7;//height and width
    boolean simulationEndState=false;
    int whileCounter=0;
    int n ;
    Random rd = new Random(); // creating Random object
    Random randboolean = new Random(); // creating Random object
    int[] arr;
    Boolean[][] fire=new Boolean[2][7];
    String[][] squres=new String[2][7];
    int stepS,cccc,burnedSquares,sqRNumber;
    public void fireing(){
        System.out.println(rsquareRandomN.getText());
        sqRNumber= Integer.parseInt(String.valueOf(rsquareRandomN.getText()));// number of random squares
        start = System.currentTimeMillis();//time consume

        //Set all the squares to the normal mode
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                fire[i][j] = false;
            }
        }

            //Get the random number of the squares from the user for now is 3 fixed
        // generate the random number and the location of the burning squares
        for (int i = 0; i < sqRNumber; i++) {
            int x = (int) (Math.random() * (height));
            int y = (int) (Math.random() * (width));
            for (int p = 0; p < height; p++) {
                for (int j = 0; j < width; j++) {
                    fire[x][y] = true;
                }
            }
//            System.out.println("x= "+x+" y= "+y);//to check

        }

        //        Displaying the location of burning squares
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(fire[i][j]==true){
                    System.out.println(" square in line "+i+" , square in colum "+j);
                    System.out.println(fire[i][j]);
                }
            }
        }

        //build the array of swuares
        squres[0][0]="a"; squres[0][1]="b"; squres[0][2]="c"; squres[0][3]="d"; squres[0][4]="e"; squres[0][5]="f";
        squres[0][6]="g"; squres[1][0]="h"; squres[1][1]="i"; squres[1][2]="j"; squres[1][3]="a1"; squres[1][4]="b1";
        squres[1][5]="c1"; squres[1][6]="d1";

        //Initialize the squares in the burning mode
        for (int ii = 0; ii < height; ii++) {
            for (int jj = 0; jj < width; jj++) {

//            System.out.println("square is burning= " +squres[arr[o]]); //display more info
                if(fire[ii][jj]==true) {
                    String name = squres[ii][jj];
//            System.out.println("square name is = "+name); //display more info
                    switch (name) {
                        case "a":
                            a.setFill(Color.RED);
                            System.out.println("square A is firing");
                            break;
                        case "b":
                            b.setFill(Color.RED);
                            System.out.println("square B is firing");
                            break;
                        case "c":
                            c.setFill(Color.RED);
                            System.out.println("square C is firing");
                            break;
                        case "d":
                            d.setFill(Color.RED);
                            System.out.println("square D is firing");
                            break;
                        case "e":
                            e.setFill(Color.RED);
                            System.out.println("square E is firing");
                            break;
                        case "f":
                            f.setFill(Color.RED);
                            System.out.println("square F is firing");
                            break;
                        case "g":
                            g.setFill(Color.RED);
                            System.out.println("square G is firing");
                            break;
                        case "h":
                            h.setFill(Color.RED);
                            System.out.println("square H is firing");
                            break;
                        case "i":
                            i.setFill(Color.RED);
                            System.out.println("square I is firing");
                            break;
                        case "j":
                            j.setFill(Color.RED);
                            System.out.println("square J is firing");
                            break;
                        case "a1":
                            a1.setFill(Color.RED);
                            System.out.println("square A1 is firing");
                            break;
                        case "b1":
                            b1.setFill(Color.RED);
                            System.out.println("square B1 is firing");
                            break;
                        case "c1":
                            c1.setFill(Color.RED);
                            System.out.println("square C1 is firing");
                            break;
                        case "d1":
                            d1.setFill(Color.RED);
                            System.out.println("square D1 is firing");
                            break;
                        case "e1":
                            e1.setFill(Color.RED);
                            System.out.println("square E1 is firing");
                            break;
                        case "f1":
                            f1.setFill(Color.RED);
                            System.out.println("square F1 is firing");
                            break;
                        case "g1":
                            g1.setFill(Color.RED);
                            System.out.println("square G1 is firing");
                            break;


                    }
                }
//            Thread.sleep(1000);
        }}

    }

    public void changeColor() throws InterruptedException {

         stepS=0; //For all the steps of the in the while loop

        ///adding the working part
        while (!simulationEndState) {
            //Counter of While loop
            whileCounter++;
            //Displaying
            whileCounterText.setText(String.valueOf(whileCounter));


//simulation work
            for (int s = 0; s < height; s++) {
                for (int ss = 0; ss < width; ss++) {
                    stepS++;//counter of the steps
                    if (fire[s][ss] != null) {
                        if (fire[s][ss] == true) { // check the state of each square
                            boolean stateT1 = randboolean.nextBoolean(); //for the random boolean state

                            //just for displaying
//                        System.out.println("Random State of t+1 is : "+stateT1); // displaying a random boolean

                            //if true take the first choice. first choice of the t+1
                            if (stateT1) {
                                String name = squres[s][ss];
                                switch (name) {
                                    case "a":
                                        a.setFill(Color.BLACK);
                                        System.out.println("square A is turned off");
                                        break;
                                    case "b":
                                        b.setFill(Color.BLACK);
                                        System.out.println("square B is turned off");
                                        break;
                                    case "c":
                                        c.setFill(Color.BLACK);
                                        System.out.println("square C is turned off");
                                        break;
                                    case "d":
                                        d.setFill(Color.BLACK);
                                        System.out.println("square D is turned off");
                                        break;
                                    case "e":
                                        e.setFill(Color.BLACK);
                                        System.out.println("square E is turned off");
                                        break;
                                    case "f":
                                        f.setFill(Color.BLACK);
                                        System.out.println("square F is turned off");
                                        break;
                                    case "g":
                                        g.setFill(Color.BLACK);
                                        System.out.println("square G is turned off");
                                        break;
                                    case "h":
                                        h.setFill(Color.BLACK);
                                        System.out.println("square H is turned off");
                                        break;
                                    case "i":
                                        i.setFill(Color.BLACK);
                                        System.out.println("square I is turned off");
                                        break;
                                    case "j":
                                        j.setFill(Color.BLACK);
                                        System.out.println("square J is turned off");
                                        break;
                                    case "a1":
                                        a1.setFill(Color.BLACK);
                                        System.out.println("square A1 is turned off");
                                        break;
                                    case "b1":
                                        b1.setFill(Color.BLACK);
                                        System.out.println("square B1 is turned off");
                                        break;
                                    case "c1":
                                        c1.setFill(Color.BLACK);
                                        System.out.println("square C1 is turned off");
                                        break;
                                    case "d1":
                                        d1.setFill(Color.BLACK);
                                        System.out.println("square D1 turned off");
                                        break;
                                    case "e1":
                                        e1.setFill(Color.BLACK);
                                        System.out.println("square E1 turned off");
                                        break;
                                    case "f1":
                                        f1.setFill(Color.BLACK);
                                        System.out.println("square F1 turned off");
                                        break;
                                    case "g1":
                                        g1.setFill(Color.BLACK);
                                        System.out.println("square G1 turned off");
                                        break;


                                }
                                fire[s][ss] = null;

                            } else { //check the second state of the choices t+1
                                fire[s][ss] = null;
                                String names = squres[s][ss];
                                switch (names) {
                                    case "a":
                                        a.setFill(Color.BLACK);
                                        System.out.println("square A is turned off");
                                        break;
                                    case "b":
                                        b.setFill(Color.BLACK);
                                        System.out.println("square B is turned off");
                                        break;
                                    case "c":
                                        c.setFill(Color.BLACK);
                                        System.out.println("square C is turned off");
                                        break;
                                    case "d":
                                        d.setFill(Color.BLACK);
                                        System.out.println("square D is turned off");
                                        break;
                                    case "e":
                                        e.setFill(Color.BLACK);
                                        System.out.println("square E is turned off");
                                        break;
                                    case "f":
                                        f.setFill(Color.BLACK);
                                        System.out.println("square F is turned off");
                                        break;
                                    case "g":
                                        g.setFill(Color.BLACK);
                                        System.out.println("square G is turned off");
                                        break;
                                    case "h":
                                        h.setFill(Color.BLACK);
                                        System.out.println("square H is turned off");
                                        break;
                                    case "i":
                                        i.setFill(Color.BLACK);
                                        System.out.println("square I is turned off");
                                        break;
                                    case "j":
                                        j.setFill(Color.BLACK);
                                        System.out.println("square J is turned off");
                                        break;
                                    case "a1":
                                        a1.setFill(Color.BLACK);
                                        System.out.println("square A1 is turned off");
                                        break;
                                    case "b1":
                                        b1.setFill(Color.BLACK);
                                        System.out.println("square B1 is turned off");
                                        break;
                                    case "c1":
                                        c1.setFill(Color.BLACK);
                                        System.out.println("square C1 is turned off");
                                        break;
                                    case "d1":
                                        d1.setFill(Color.BLACK);
                                        System.out.println("square D1 turned off");
                                        break;
                                    case "e1":
                                        e1.setFill(Color.BLACK);
                                        System.out.println("square E1 turned off");
                                        break;
                                    case "f1":
                                        f1.setFill(Color.BLACK);
                                        System.out.println("square F1 turned off");
                                        break;
                                    case "g1":
                                        g1.setFill(Color.BLACK);
                                        System.out.println("square G1 turned off");
                                        break;


                                }
                                if (ss + 1 < width && fire[s][ss + 1] != null && fire[s][ss + 1] != true) {
                                    //if the square is firing there is no since to firing it again
                                    String name = squres[s][ss + 1];
                                    switch (name) {
                                        case "a":
                                            a.setFill(Color.RED);
                                            System.out.println("square A is firing");
                                            break;
                                        case "b":
                                            b.setFill(Color.RED);
                                            System.out.println("square B is firing");
                                            break;
                                        case "c":
                                            c.setFill(Color.RED);
                                            System.out.println("square C is firing");
                                            break;
                                        case "d":
                                            d.setFill(Color.RED);
                                            System.out.println("square D is firing");
                                            break;
                                        case "e":
                                            e.setFill(Color.RED);
                                            System.out.println("square E is firing");
                                            break;
                                        case "f":
                                            f.setFill(Color.RED);
                                            System.out.println("square F is firing");
                                            break;
                                        case "g":
                                            g.setFill(Color.RED);
                                            System.out.println("square G is firing");
                                            break;
                                        case "h":
                                            h.setFill(Color.RED);
                                            System.out.println("square H is firing");
                                            break;
                                        case "i":
                                            i.setFill(Color.RED);
                                            System.out.println("square I is firing");
                                            break;
                                        case "j":
                                            j.setFill(Color.RED);
                                            System.out.println("square J is firing");
                                            break;
                                        case "a1":
                                            a1.setFill(Color.RED);
                                            System.out.println("square A1 is firing");
                                            break;
                                        case "b1":
                                            b1.setFill(Color.RED);
                                            System.out.println("square B1 is firing");
                                            break;
                                        case "c1":
                                            c1.setFill(Color.RED);
                                            System.out.println("square C1 is firing");
                                            break;
                                        case "d1":
                                            d1.setFill(Color.RED);
                                            System.out.println("square D1 is firing");
                                            break;
                                        case "e1":
                                            e1.setFill(Color.RED);
                                            System.out.println("square E1 is firing");
                                            break;
                                        case "f1":
                                            f1.setFill(Color.RED);
                                            System.out.println("square F1 is firing");
                                            break;
                                        case "g1":
                                            g1.setFill(Color.RED);
                                            System.out.println("square G1 is firing");
                                            break;


                                    }
                                    fire[s][ss + 1] = true;

//                            Thread.sleep(100);
                                }
                                if (ss - 1 >= 0 && fire[s][ss - 1] != null && fire[s][ss - 1] != true) {
                                    //if the square is firing there is no since to firing it again
                                    String name = squres[s][ss - 1];
                                    switch (name) {
                                        case "a":
                                            a.setFill(Color.RED);
                                            System.out.println("square A is firing");
                                            break;
                                        case "b":
                                            b.setFill(Color.RED);
                                            System.out.println("square B is firing");
                                            break;
                                        case "c":
                                            c.setFill(Color.RED);
                                            System.out.println("square C is firing");
                                            break;
                                        case "d":
                                            d.setFill(Color.RED);
                                            System.out.println("square D is firing");
                                            break;
                                        case "e":
                                            e.setFill(Color.RED);
                                            System.out.println("square E is firing");
                                            break;
                                        case "f":
                                            f.setFill(Color.RED);
                                            System.out.println("square F is firing");
                                            break;
                                        case "g":
                                            g.setFill(Color.RED);
                                            System.out.println("square G is firing");
                                            break;
                                        case "h":
                                            h.setFill(Color.RED);
                                            System.out.println("square H is firing");
                                            break;
                                        case "i":
                                            i.setFill(Color.RED);
                                            System.out.println("square I is firing");
                                            break;
                                        case "j":
                                            j.setFill(Color.RED);
                                            System.out.println("square J is firing");
                                            break;
                                        case "a1":
                                            a1.setFill(Color.RED);
                                            System.out.println("square A1 is firing");
                                            break;
                                        case "b1":
                                            b1.setFill(Color.RED);
                                            System.out.println("square B1 is firing");
                                            break;
                                        case "c1":
                                            c1.setFill(Color.RED);
                                            System.out.println("square C1 is firing");
                                            break;
                                        case "d1":
                                            d1.setFill(Color.RED);
                                            System.out.println("square D1 is firing");
                                            break;
                                        case "e1":
                                            e1.setFill(Color.RED);
                                            System.out.println("square E1 is firing");
                                            break;
                                        case "f1":
                                            f1.setFill(Color.RED);
                                            System.out.println("square F1 is firing");
                                            break;
                                        case "g1":
                                            g1.setFill(Color.RED);
                                            System.out.println("square G1 is firing");
                                            break;


                                    }
                                    fire[s][ss - 1] = true;
//                            Thread.sleep(100);
                                }
                                if (s - 1 >= 0 && fire[s - 1][ss] != null && fire[s - 1][ss] != true) {
                                    //working in the row side
                                    //if the square is firing there is no since to firing it again
                                    String name = squres[s - 1][ss];
                                    switch (name) {
                                        case "a":
                                            a.setFill(Color.RED);
                                            System.out.println("square A is firing");
                                            break;
                                        case "b":
                                            b.setFill(Color.RED);
                                            System.out.println("square B is firing");
                                            break;
                                        case "c":
                                            c.setFill(Color.RED);
                                            System.out.println("square C is firing");
                                            break;
                                        case "d":
                                            d.setFill(Color.RED);
                                            System.out.println("square D is firing");
                                            break;
                                        case "e":
                                            e.setFill(Color.RED);
                                            System.out.println("square E is firing");
                                            break;
                                        case "f":
                                            f.setFill(Color.RED);
                                            System.out.println("square F is firing");
                                            break;
                                        case "g":
                                            g.setFill(Color.RED);
                                            System.out.println("square G is firing");
                                            break;
                                        case "h":
                                            h.setFill(Color.RED);
                                            System.out.println("square H is firing");
                                            break;
                                        case "i":
                                            i.setFill(Color.RED);
                                            System.out.println("square I is firing");
                                            break;
                                        case "j":
                                            j.setFill(Color.RED);
                                            System.out.println("square J is firing");
                                            break;
                                        case "a1":
                                            a1.setFill(Color.RED);
                                            System.out.println("square A1 is firing");
                                            break;
                                        case "b1":
                                            b1.setFill(Color.RED);
                                            System.out.println("square B1 is firing");
                                            break;
                                        case "c1":
                                            c1.setFill(Color.RED);
                                            System.out.println("square C1 is firing");
                                            break;
                                        case "d1":
                                            d1.setFill(Color.RED);
                                            System.out.println("square D1 is firing");
                                            break;
                                        case "e1":
                                            e1.setFill(Color.RED);
                                            System.out.println("square E1 is firing");
                                            break;
                                        case "f1":
                                            f1.setFill(Color.RED);
                                            System.out.println("square F1 is firing");
                                            break;
                                        case "g1":
                                            g1.setFill(Color.RED);
                                            System.out.println("square G1 is firing");
                                            break;


                                    }
                                    fire[s - 1][ss] = true;
//                            Thread.sleep(100);
                                }
                                if (s + 1 < height && fire[s + 1][ss] != null && fire[s + 1][ss] != true) {
                                    //if the square is firing there is no since to firing it again
                                    String name = squres[s + 1][ss];
                                    switch (name) {
                                        case "a":
                                            a.setFill(Color.RED);
                                            System.out.println("square A is firing");
                                            break;
                                        case "b":
                                            b.setFill(Color.RED);
                                            System.out.println("square B is firing");
                                            break;
                                        case "c":
                                            c.setFill(Color.RED);
                                            System.out.println("square C is firing");
                                            break;
                                        case "d":
                                            d.setFill(Color.RED);
                                            System.out.println("square D is firing");
                                            break;
                                        case "e":
                                            e.setFill(Color.RED);
                                            System.out.println("square E is firing");
                                            break;
                                        case "f":
                                            f.setFill(Color.RED);
                                            System.out.println("square F is firing");
                                            break;
                                        case "g":
                                            g.setFill(Color.RED);
                                            System.out.println("square G is firing");
                                            break;
                                        case "h":
                                            h.setFill(Color.RED);
                                            System.out.println("square H is firing");
                                            break;
                                        case "i":
                                            i.setFill(Color.RED);
                                            System.out.println("square I is firing");
                                            break;
                                        case "j":
                                            j.setFill(Color.RED);
                                            System.out.println("square J is firing");
                                            break;
                                        case "a1":
                                            a1.setFill(Color.RED);
                                            System.out.println("square A1 is firing");
                                            break;
                                        case "b1":
                                            b1.setFill(Color.RED);
                                            System.out.println("square B1 is firing");
                                            break;
                                        case "c1":
                                            c1.setFill(Color.RED);
                                            System.out.println("square C1 is firing");
                                            break;
                                        case "d1":
                                            d1.setFill(Color.RED);
                                            System.out.println("square D1 is firing");
                                            break;
                                        case "e1":
                                            e1.setFill(Color.RED);
                                            System.out.println("square E1 is firing");
                                            break;
                                        case "f1":
                                            f1.setFill(Color.RED);
                                            System.out.println("square F1 is firing");
                                            break;
                                        case "g1":
                                            g1.setFill(Color.RED);
                                            System.out.println("square G1 is firing");
                                            break;


                                    }
                                    fire[s + 1][ss] = true;
//                            Thread.sleep(100);
                                }
//
                            }

                        }//end for check the state of each square
//                    Thread.sleep(100);
                    }
                }//end  check the burn square  for one
            }//loope2d

            //Counter to check the condition of stop the simulation
             cccc=0;
            //number of burned squares
            burnedSquares=0;

            //Check to Stop the simulation
            for (int i=0;i< height;i++){
                for (int j=0;j< width;j++){
                    if (fire[i][j] == null || !fire[i][j]) { //simply
                        cccc++;
                    }
                }
            }

            //Check the stop simulation condition
            if(cccc == height*width){
                for (int i=0;i< height;i++){
                    for (int j=0;j< width;j++) {
                        if (fire[i][j] == null) {
                            burnedSquares++;
                        }
                    }
                }
                simulationEndState = true;
                break;
            }


        }//while
        squaresBurned.setText(String.valueOf(burnedSquares));

        System.out.println("final number od steps: "+stepS); //final steps

        //calculate the time of the simulation
         end = System.currentTimeMillis();
         execution =(end - start) / 1000F;;
        System.out.println(execution + " second");
        timeExecution.setText(String.valueOf(execution));

    }//End of ChangeColor function

    public void resetSimulation(){

        //Rest the background of the squares
        for (int o=0;o< height;o++) {
            for (int oo = 0; oo < width; oo++) {
                String name = squres[o][oo];
//            System.out.println("square name is = "+name); //display more info
                switch (name) {
                    case "a":
                        a.setFill(Color.DODGERBLUE);
                        break;
                    case "b":
                        b.setFill(Color.DODGERBLUE);
                        break;
                    case "c":
                        c.setFill(Color.DODGERBLUE);
                        break;
                    case "d":
                        d.setFill(Color.DODGERBLUE);
                        break;
                    case "e":
                        e.setFill(Color.DODGERBLUE);
                        break;
                    case "f":
                        f.setFill(Color.DODGERBLUE);
                        break;
                    case "g":
                        g.setFill(Color.DODGERBLUE);
                        break;
                    case "h":
                        h.setFill(Color.DODGERBLUE);
                        break;
                    case "i":
                        i.setFill(Color.DODGERBLUE);
                        break;
                    case "j":
                        j.setFill(Color.DODGERBLUE);
                        break;
                    case "a1":
                        a1.setFill(Color.DODGERBLUE);
                        break;
                    case "b1":
                        b1.setFill(Color.DODGERBLUE);
                        break;
                    case "c1":
                        c1.setFill(Color.DODGERBLUE);
                        break;
                    case "d1":
                        d1.setFill(Color.DODGERBLUE);
                        break;
                    case "e1":
                        e1.setFill(Color.DODGERBLUE);
                        break;
                    case "f1":
                        f1.setFill(Color.DODGERBLUE);
                        break;
                    case "g1":
                        g1.setFill(Color.DODGERBLUE);
                        break;


                }
            }
        }

        //Reset the counters of the simulation
        cccc=0;
        burnedSquares=0;
        whileCounter=0;
        execution=0;
        start = System.currentTimeMillis();//time consume
        //Reset the fields of the information displaying
        timeExecution.setText("");
        whileCounterText.setText("");
        squaresBurned.setText("");
        //Reset the simulation condition
        simulationEndState=false;

    }

}


