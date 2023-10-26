
import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TorresDeHanoiV3.java
 *
 * Created on 03-abr-2012, 21:04:42
 */
/**
 *
 * @author Administrador
 */
public class TorresDeHanoiV3 extends javax.swing.JFrame {

    Color r=Color.RED,b=Color.BLUE,y=Color.YELLOW,o=Color.ORANGE,v=Color.GREEN;
    int t1[]={5,4,3,2,1};
    int t2[]={0,0,0,0,0};
    int t3[]={0,0,0,0,0};
    int n=0,m=0,mov=0,pt1=4,pt2=-1,pt3=-1,x;

    public void t1() {
        x=75;
        if(label1.getText().equals("0")){label1.setVisible(false);}else{label1.setVisible(true);
            if(t1[4]==1){label1.setBackground(r);label1.setSize(40,20);label1.setLocation(54, 62);}}
        if(label2.getText().equals("0")){label2.setVisible(false);}else{label2.setVisible(true);
            if(t1[3]==1){label2.setBackground(r);label2.setSize(40,20);label2.setLocation(x-20, 95);}
            if(t1[3]==2){label2.setBackground(b);label2.setSize(55,20);label2.setLocation(x-27, 95);}    }
        if(label3.getText().equals("0")){label3.setVisible(false);}else{label3.setVisible(true);
            if(t1[2]==1){label3.setBackground(r);label3.setSize(40,20);label3.setLocation(x-20, 128);}
            if(t1[2]==2){label3.setBackground(b);label3.setSize(55,20);label3.setLocation(x-27, 128);}
            if(t1[2]==3){label3.setBackground(y);label3.setSize(70,20);label3.setLocation(x-35, 128);}    }
        if(label4.getText().equals("0")){label4.setVisible(false);}else{label4.setVisible(true);
            if(t1[1]==1){label4.setBackground(r);label4.setSize(40,20);label4.setLocation(x-20, 161);}
            if(t1[1]==2){label4.setBackground(b);label4.setSize(55,20);label4.setLocation(x-27, 161);}    
            if(t1[1]==3){label4.setBackground(y);label4.setSize(70,20);label4.setLocation(x-35, 161);}    
            if(t1[1]==4){label4.setBackground(o);label4.setSize(85,20);label4.setLocation(x-42, 161);}    }
        if(label5.getText().equals("0")){label5.setVisible(false);}else{label5.setVisible(true);
            if(t1[0]==1){label5.setBackground(r);label5.setSize(40,20);label5.setLocation(x-20, 194);}
            if(t1[0]==2){label5.setBackground(b);label5.setSize(55,20);label5.setLocation(x-27, 194);}    
            if(t1[0]==3){label5.setBackground(y);label5.setSize(70,20);label5.setLocation(x-35, 194);}    
            if(t1[0]==4){label5.setBackground(o);label5.setSize(85,20);label5.setLocation(x-42, 194);}    
            if(t1[0]==5){label5.setBackground(v);label5.setSize(100,20);label5.setLocation(x-50, 194);}    }
    }
    public void t2() {
        x=200;
        if(label6.getText().equals("0")){label6.setVisible(false);}else{label6.setVisible(true);
            if(t2[4]==1){label6.setBackground(r);label6.setSize(40,20);label6.setLocation(x-20, 62);}}
        if(label7.getText().equals("0")){label7.setVisible(false);}else{label7.setVisible(true);
            if(t2[3]==1){label7.setBackground(r);label7.setSize(40,20);label7.setLocation(x-20, 95);}
            if(t2[3]==2){label7.setBackground(b);label7.setSize(55,20);label7.setLocation(x-27, 95);}    }
        if(label8.getText().equals("0")){label8.setVisible(false);}else{label8.setVisible(true);
            if(t2[2]==1){label8.setBackground(r);label8.setSize(40,20);label8.setLocation(x-20, 128);}
            if(t2[2]==2){label8.setBackground(b);label8.setSize(55,20);label8.setLocation(x-27, 128);}
            if(t2[2]==3){label8.setBackground(y);label8.setSize(70,20);label8.setLocation(x-35, 128);}    }
        if(label9.getText().equals("0")){label9.setVisible(false);}else{label9.setVisible(true);
            if(t2[1]==1){label9.setBackground(r);label9.setSize(40,20);label9.setLocation(x-20, 161);}
            if(t2[1]==2){label9.setBackground(b);label9.setSize(55,20);label9.setLocation(x-27, 161);}
            if(t2[1]==3){label9.setBackground(y);label9.setSize(70,20);label9.setLocation(x-35, 161);}
            if(t2[1]==4){label9.setBackground(o);label9.setSize(85,20);label9.setLocation(x-42, 161);}    }
        if(label10.getText().equals("0")){label10.setVisible(false);}else{label10.setVisible(true);
            if(t2[0]==1){label10.setBackground(r);label10.setSize(40,20);label10.setLocation(x-20, 194);}
            if(t2[0]==2){label10.setBackground(b);label10.setSize(55,20);label10.setLocation(x-27, 194);}
            if(t2[0]==3){label10.setBackground(y);label10.setSize(70,20);label10.setLocation(x-35, 194);}
            if(t2[0]==4){label10.setBackground(o);label10.setSize(85,20);label10.setLocation(x-42, 194);}
            if(t2[0]==5){label10.setBackground(v);label10.setSize(100,20);label10.setLocation(x-50, 194);}    }
    }
    public void t3() {
        x=325;
        if(label11.getText().equals("0")){label11.setVisible(false);}else{label11.setVisible(true);
            if(t3[4]==1){label11.setBackground(r);label11.setSize(40,20);label11.setLocation(x-20, 62);}}
        if(label12.getText().equals("0")){label12.setVisible(false);}else{label12.setVisible(true);
            if(t3[3]==1){label12.setBackground(r);label12.setSize(40,20);label12.setLocation(x-20, 95);}
            if(t3[3]==2){label12.setBackground(b);label12.setSize(55,20);label12.setLocation(x-27, 95);}    }
        if(label13.getText().equals("0")){label13.setVisible(false);}else{label13.setVisible(true);
            if(t3[2]==1){label13.setBackground(r);label13.setSize(40,20);label13.setLocation(x-20, 128);}
            if(t3[2]==2){label13.setBackground(b);label13.setSize(55,20);label13.setLocation(x-27, 128);}    
            if(t3[2]==3){label13.setBackground(y);label13.setSize(70,20);label13.setLocation(x-35, 128);}    }
        if(label14.getText().equals("0")){label14.setVisible(false);}else{label14.setVisible(true);
            if(t3[1]==1){label14.setBackground(r);label14.setSize(40,20);label14.setLocation(x-20, 161);}
            if(t3[1]==2){label14.setBackground(b);label14.setSize(55,20);label14.setLocation(x-27, 161);}    
            if(t3[1]==3){label14.setBackground(y);label14.setSize(70,20);label14.setLocation(x-35, 161);}    
            if(t3[1]==4){label14.setBackground(o);label14.setSize(85,20);label14.setLocation(x-42, 161);}    }
        if(label15.getText().equals("0")){label15.setVisible(false);}else{label15.setVisible(true);
            if(t3[0]==1){label15.setBackground(r);label15.setSize(40,20);label15.setLocation(x-20, 194);}
            if(t3[0]==2){label15.setBackground(b);label15.setSize(55,20);label15.setLocation(x-27, 194);}    
            if(t3[0]==3){label15.setBackground(y);label15.setSize(70,20);label15.setLocation(x-35, 194);}    
            if(t3[0]==4){label15.setBackground(o);label15.setSize(85,20);label15.setLocation(x-42, 194);}    
            if(t3[0]==5){label15.setBackground(v);label15.setSize(100,20);label15.setLocation(x-50, 194);}    }
    }
    void est(){
        
        label1.setText(""+t1[4]);
        label2.setText(""+t1[3]);
        label3.setText(""+t1[2]);
        label4.setText(""+t1[1]);
        label5.setText(""+t1[0]);
        label6.setText(""+t2[4]);
        label7.setText(""+t2[3]);
        label8.setText(""+t2[2]);
        label9.setText(""+t2[1]);
        label10.setText(""+t2[0]);
        label11.setText(""+t3[4]);
        label12.setText(""+t3[3]);
        label13.setText(""+t3[2]);
        label14.setText(""+t3[1]);
        label15.setText(""+t3[0]);
        label16.setText(""+n);
        imp();
        label17.setText("Movimientos: "+mov);
    }
    void imp(){
        System.out.println("t1 "+t1[4]+" "+"t2 "+t2[4]+" "+"t3 "+t3[4]+"  ");
        System.out.println("t1 "+t1[3]+" "+"t2 "+t2[3]+" "+"t3 "+t3[3]+" ");
        System.out.println("t1 "+t1[2]+" "+"t2 "+t2[2]+" "+"t3 "+t3[2]+" ");
        System.out.println("t1 "+t1[1]+" "+"t2 "+t2[1]+" "+"t3 "+t3[1]+" ");
        System.out.println("t1 "+t1[0]+" "+"t2 "+t2[0]+" "+"t3 "+t3[0]+" ");
        System.out.println("pt1 "+pt1+" "+"pt2 "+pt2+" "+"pt3 "+pt3+" ");
        System.out.println("1 "+label1.getBounds()+" 2 "+label2.getBounds()+" 3 "+label3.getBounds()+" 4 "+label4.getBounds()+" 5 "+label5.getBounds());
        System.out.println("10 "+label10.getBounds());
        System.out.println("15 "+label15.getBounds());
        
    }
    void Evic() throws InterruptedException{
        if( (t1[4]==1 || t2[4]==1 || t3[4]==1) && mov>=31){
            label17.setText("Felicidades Venciste con Movimientos: "+mov);
            for(int i=0;i<=35;i++){
                label17.setForeground(Color.yellow);
                Thread.sleep(200);
                label17.setForeground(Color.red);
                Thread.sleep(200);
            }
            System.exit(1);
        }
    }
    void visible(){
        t1();
        t2();
        t3();
        
        x=200;
        if(label16.getText().equals("0")){label16.setVisible(false);}else{label16.setVisible(true);
            if(n==1){label16.setBackground(r);label16.setSize(40,20);label16.setLocation(x-20, 10);}
            if(n==2){label16.setBackground(b);label16.setSize(55,20);label16.setLocation(x-27, 10);}
            if(n==3){label16.setBackground(y);label16.setSize(70,20);label16.setLocation(x-35, 10);}
            if(n==4){label16.setBackground(o);label16.setSize(85,20);label16.setLocation(x-42, 10);}
            if(n==5){label16.setBackground(v);label16.setSize(100,20);label16.setLocation(x-50, 10);}    }        
    }
    public TorresDeHanoiV3() {
        super("Torres de Hanoí V3.7");
        initComponents();
        setSize(400,300);
        label1.setText(""+t1[4]);
        label2.setText(""+t1[3]);
        label3.setText(""+t1[2]);
        label4.setText(""+t1[1]);
        label5.setText(""+t1[0]);
        label6.setText(""+t2[4]);
        label7.setText(""+t2[3]);
        label8.setText(""+t2[2]);
        label9.setText(""+t2[1]);
        label10.setText(""+t2[0]);
        label11.setText(""+t3[4]);
        label12.setText(""+t3[3]);
        label13.setText(""+t3[2]);
        label14.setText(""+t3[1]);
        label15.setText(""+t3[0]);
        label16.setText(""+n);
        //System.err.println("1 "+label1.getBounds()+" 2 "+label2.getBounds()+" 3 "+label3.getBounds()+" 4 "+label4.getBounds()+" 5 "+label5.getBounds());
        System.err.println(this.getBounds());
        est();
        visible();
        est();
        visible();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(204, 255, 204));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(204, 255, 204));
        label2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(204, 255, 204));
        label3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(204, 255, 204));
        label4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(204, 255, 204));
        label5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(204, 255, 204));
        label6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(new java.awt.Color(204, 255, 204));
        label7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setBackground(new java.awt.Color(204, 255, 204));
        label8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setBackground(new java.awt.Color(204, 255, 204));
        label9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setBackground(new java.awt.Color(204, 255, 204));
        label10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setBackground(new java.awt.Color(204, 255, 204));
        label11.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setBackground(new java.awt.Color(204, 255, 204));
        label12.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setBackground(new java.awt.Color(204, 255, 204));
        label13.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setBackground(new java.awt.Color(204, 255, 204));
        label14.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label15.setAlignment(java.awt.Label.CENTER);
        label15.setBackground(new java.awt.Color(204, 255, 204));
        label15.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        label16.setAlignment(java.awt.Label.CENTER);
        label16.setBackground(new java.awt.Color(255, 255, 255));
        label16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        label17.setAlignment(java.awt.Label.CENTER);
        label17.setBackground(java.awt.Color.lightGray);
        label17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label17.setText("Presiona Entrar para Iniciar o Reiniciar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label16, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label17, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode()==10){//Enter
            est();
            visible();            
        }
        if(evt.getKeyCode()==37){//flecha Izq 
            if(m==0){
                if(pt1!=-1){
                    n=t1[pt1];
                    t1[pt1]=0;
                    pt1--;
                    m=1;
                }
            }else if(m==1){
                if(pt1!=-1){
                    if(n<t1[pt1]){
                        pt1++;
                        t1[pt1]=n;
                        n=0;
                        m=0;
                        mov++;
                    }
                }else{
                    pt1++;
                    t1[pt1]=n;
                    n=0;
                    m=0;
                    mov++;
                }
            }
        }
        if(evt.getKeyCode()==40){//flecha Aba 
            if(m==0){
                if(pt2!=-1){
                    n=t2[pt2];
                    t2[pt2]=0;
                    pt2--;
                    m=1;
                }
            }else if(m==1){
                if(pt2!=-1){
                    if(n<t2[pt2]){
                        pt2++;
                        t2[pt2]=n;
                        n=0;
                        m=0;
                        mov++;
                    }
                }else{
                    pt2++;
                    t2[pt2]=n;
                    n=0;
                    m=0;
                    mov++;
                }
            }
        }
        if(evt.getKeyCode()==39){//flecha Der 
            if(m==0){
                if(pt3!=-1){
                    n=t3[pt3];
                    t3[pt3]=0;
                    pt3--;
                    m=1;
                }
            }else if(m==1){
                if(pt3!=-1){
                    if(n<t3[pt3]){
                        pt3++;
                        t3[pt3]=n;
                        n=0;
                        m=0;
                        mov++;
                    }
                }else{
                    pt3++;
                    t3[pt3]=n;
                    n=0;
                    m=0;
                    mov++;
                }
            }
        }
        est();
        visible();
        try {
            Evic();
        } catch (InterruptedException ex) {
            Logger.getLogger(TorresDeHanoiV3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new TorresDeHanoiV3().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
}
