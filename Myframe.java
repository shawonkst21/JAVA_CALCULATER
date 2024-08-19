package Calculater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Myframe extends JFrame implements ActionListener {
    JLabel label=new JLabel();
    JTextField text=new JTextField();
    JRadioButton on=new JRadioButton("on");
    JRadioButton of=new JRadioButton("of");
    JButton one=new JButton("1");
    JButton two=new JButton("2");
    JButton three=new JButton("3");
    JButton four=new JButton("4");
    JButton five=new JButton("5");
    JButton six=new JButton("6");
    JButton seven=new JButton("7");
    JButton eight=new JButton("8");
    JButton nine=new JButton("9");
    JButton zero=new JButton("0");
    JButton equal=new JButton("=");
    JButton div=new JButton("/");
    JButton multi=new JButton("*");
    JButton plus=new JButton("+");
    JButton minus=new JButton("-");
    JButton dot=new JButton(".");
    JButton del=new JButton("DEL");
    JButton clear=new JButton("C");
    JButton square=new JButton("x\u00B2");
    JButton cube=new JButton("x\u00B3");
    JButton sqrt=new JButton("\u221A");
    Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
    double num1=0,num2=0,result=0;
    int calculate;
    ImageIcon image=new ImageIcon("cal.jpg");



      Myframe()
      {
          this.setSize(305,510);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.getContentPane().setBackground(Color.BLACK);
          this.setLayout(null);
          this.setLocationRelativeTo(null);
          this.setTitle("Calculater");
          this.setIconImage(image.getImage());
          this.setVisible(true);

          addcomponents();

      }
      public void addcomponents()
      {
          //add label
          label.setBounds(250,0,50,50);
          label.setForeground(Color.white);
          this.add(label);

          //add textfield
          text.setBounds(10,40,270,60);
          text.setFont(new Font("Arial",Font.BOLD,20));
          text.setEditable(false);//why
          text.setHorizontalAlignment(JTextField.RIGHT);
          this.add(text);

          //add button
          on.setBounds(10,105,60,20);
          on.setSelected(true);
          on.setFont(new Font("Arial",Font.BOLD,14));
          on.setBackground(Color.BLACK);
          on.setForeground(Color.white);
          on.setFocusable(false);
          on.addActionListener(this);
          this.add(on);

          of.setBounds(10,125,60,20);
          of.setSelected(true);
          of.setFont(new Font("Arial",Font.BOLD,14));
          of.setBackground(Color.BLACK);
          of.setForeground(Color.white);
          of.setFocusable(false);
          of.addActionListener(this);
          this.add(of);
          ButtonGroup grp=new ButtonGroup();
          grp.add(on);
          grp.add(of);

          seven.setBounds(10,230,60,40);
          seven.setFont(new Font("Arial",Font.BOLD,20));
          seven.setFocusable(false);
          seven.addActionListener(this);
          seven.setCursor(cursor);
          this.add(seven);

          eight.setBounds(80,230,60,40);
          eight.setFont(new Font("Arial",Font.BOLD,20));
          eight.setFocusable(false);
          eight.addActionListener(this);
          eight.setCursor(cursor);
          this.add(eight);

          nine.setBounds(150,230,60,40);
          nine.setFont(new Font("Arial",Font.BOLD,20));
          nine.setFocusable(false);
          nine.setCursor(cursor);
          nine.addActionListener(this);

          this.add(nine);

          four.setBounds(10,290,60,40);
          four.setFont(new Font("Arial",Font.BOLD,20));
          four.setFocusable(false);
          four.setCursor(cursor);
          four.addActionListener(this);

          this.add(four);

          five.setBounds(80,290,60,40);
          five.setFont(new Font("Arial",Font.BOLD,20));
          five.setFocusable(false);
          five.setCursor(cursor);

          five.addActionListener(this);

          this.add(five);

          six.setBounds(150,290,60,40);
          six.setFont(new Font("Arial",Font.BOLD,20));
          six.setFocusable(false);
          six.setCursor(cursor);
          six.addActionListener(this);

          this.add(six);

          one.setBounds(10,350,60,40);
          one.setFont(new Font("Arial",Font.BOLD,20));
          one.setFocusable(false);
          one.addActionListener(this);
          one.setCursor(cursor);

          this.add(one);

          two.setBounds(80,350,60,40);
          two.setFont(new Font("Arial",Font.BOLD,20));
          two.setFocusable(false);
          two.addActionListener(this);
          two.setCursor(cursor);

          this.add(two);

          three.setBounds(150,350,60,40);
          three.setFont(new Font("Arial",Font.BOLD,20));
          three.setFocusable(false);
          three.addActionListener(this);
          three.setCursor(cursor);
          //three.setBackground(Color.BLACK);
          //three.setForeground(Color.white);

          this.add(three);

          zero.setBounds(10,410,130,40);
          zero.setFont(new Font("Arial",Font.BOLD,20));
          zero.setFocusable(false);
          zero.addActionListener(this);
          zero.setCursor(cursor);

          this.add(zero);

          dot.setBounds(150,410,60,40);
          dot.setFont(new Font("Arial",Font.BOLD,20));
          dot.setFocusable(false);
          dot.addActionListener(this);
          dot.setCursor(cursor);
          this.add(dot);

          equal.setBounds(220,350,60,100);
          equal.setFont(new Font("Arial",Font.BOLD,20));
          equal.setFocusable(false);
          equal.addActionListener(this);
          equal.setCursor(cursor);
          equal.setBackground(new Color(239,188,2));

          this.add(equal);

          plus.setBounds(220,290,60,40);
          plus.setFont(new Font("Arial",Font.BOLD,20));
          plus.setFocusable(false);
          plus.addActionListener(this);
          plus.setCursor(cursor);
          plus.setBackground(new Color(239,188,2));

          this.add(plus);

          minus.setBounds(220,230,60,40);
          minus.setFont(new Font("Arial",Font.BOLD,20));
          minus.setFocusable(false);
          minus.addActionListener(this);
          minus.setCursor(cursor);
          minus.setBackground(new Color(239,188,2));

          this.add(minus);

          div.setBounds(220,110,60,40);
          div.setFont(new Font("Arial",Font.BOLD,20));
          div.setFocusable(false);
          div.addActionListener(this);
          div.setCursor(cursor);
          div.setBackground(new Color(239,188,2));

          this.add(div);

          multi.setBounds(220,170,60,40);
          multi.setFont(new Font("Arial",Font.BOLD,20));
          multi.setFocusable(false);
          multi.addActionListener(this);
          multi.setCursor(cursor);
          multi.setBackground(new Color(239,188,2));
          this.add(multi);

          sqrt.setBounds(10,170,60,40);
          sqrt.setFont(new Font("Arial",Font.BOLD,20));
          sqrt.setFocusable(false);
          sqrt.addActionListener(this);
          sqrt.setCursor(cursor);
          this.add(sqrt);

          square.setBounds(80,170,60,40);
          square.setFont(new Font("Arial",Font.BOLD,20));
          square.setFocusable(false);
          square.addActionListener(this);
          square.setCursor(cursor);

          this.add(square);

          cube.setBounds(150,170,60,40);
          cube.setFont(new Font("Arial",Font.BOLD,20));
          cube.setFocusable(false);
          cube.addActionListener(this);
          cube.setCursor(cursor);
          this.add(cube);

          del.setBounds(150,110,60,40);
          del.setFont(new Font("Arial",Font.BOLD,10));
          del.setFocusable(false);
          del.addActionListener(this);
          del.setCursor(cursor);
          del.setBackground(Color.red);
          this.add(del);

          clear.setBounds(80,110,60,40);
          clear.setFont(new Font("Arial",Font.BOLD,20));
          clear.setFocusable(false);
          clear.addActionListener(this);
          clear.setBackground(Color.red);
          clear.setCursor(cursor);
          this.add(clear);





      }
      

    @Override
    public void actionPerformed(ActionEvent e) {
          Object source=e.getSource();
          if(source==on)
          {
              enable();
          }
          else if(source==of)
          {
              disable();
          }
          else if(source==clear)
          {
              label.setText("");
              text.setText("");
          }
          else if(source==del)
          {
              int length=text.getText().length();
              int d=length-1;
              if(length>0)
              {
                  StringBuilder back=new StringBuilder(text.getText());//why
                  back.deleteCharAt(d);
                  text.setText(back.toString());

              }
              if(text.getText().endsWith(""));
              label.setText("");
          }
          else if(source==zero)
          {
              if(text.getText().equals("0"))
              {
                  return;
              }
              else {
                  text.setText(text.getText()+"0");
              }
          }
          else if(source==one)
          {
              text.setText(text.getText()+"1");
          }
          else if(source==two)
          {
              text.setText(text.getText()+"2");
          }
          else if(source==three)
          {
              text.setText(text.getText()+"3");
          }
          else if(source==four)
          {
              text.setText(text.getText()+"4");
          }
          else if(source==five)
          {
              text.setText(text.getText()+"5");
          }
          else if(source==six)
          {
              text.setText(text.getText()+"6");
          }
          else if(source==seven)
          {
              text.setText(text.getText()+"7");
          }
          else if(source==eight)
          {
              text.setText(text.getText()+"8");
          }
          else if(source==nine)
          {
              text.setText(text.getText()+"9");
          }
          else if(source==dot)
          {
              if(text.getText().contains("."))
              {
                  return;
              }
              else {
                  text.setText(text.getText()+".");
              }
          }
          else if(source==plus)
          {
              String str=text.getText();
              num1=Double.parseDouble(str);
              calculate=1;
              text.setText("");
              label.setText(str+"+");
          }
          else if(source==minus)
          {
              String str=text.getText();
              num1=Double.parseDouble(str);
              calculate=2;
              text.setText("");
              label.setText(str+"-");
          }
          else if(source==multi)
          {
              String str=text.getText();
              num1=Double.parseDouble(str);
              calculate=3;
              text.setText("");
              label.setText(str+"X");
          }
          else if(source==div)
          {
              String str=text.getText();
              num1=Double.parseDouble(str);
              calculate=4;
              text.setText("");
              label.setText(str+"/");
          }
          else if(source==square)
          {
              num1=Double.parseDouble(text.getText());
              double Square=Math.pow(num1,2);
              String sq=Double.toString(Square);
              if(sq.endsWith(".0"))
              {
                  text.setText(sq.replace(".0",""));
              }else {
                  text.setText(sq);
              }
          }
          else if(source==sqrt)
          {
              num1=Double.parseDouble(text.getText());
              double Sqrt=Math.sqrt(num1);
              text.setText(Double.toString(Sqrt));
          }
          else if(source==cube)
          {
              num1=Double.parseDouble(text.getText());
              double Square=Math.pow(num1,3);
              String sq=Double.toString(Square);
              if(sq.endsWith(".0"))
              {
                  text.setText(sq.replace(".0",""));
              }else {
                  text.setText(sq);
              }
          }
          else if(source==equal)
          {
              num2=Double.parseDouble(text.getText());
              switch (calculate)
              {
                  case 1:
                      result=num1+num2;
                      break;
                  case 2:
                      result=num1-num2;
                      break;
                  case 3:
                      result=num1*num2;
                      break;
                  case 4:
                      result=num1/num2;
                      break;
              }
              if(Double.toString(result).endsWith(".0"))
              {
                  text.setText(Double.toString(result).replace(".0",""));
              }
              else {
                  text.setText(Double.toString(result));
              }
              label.setText("");
              num1=result;

          }

    }
    public void disable()
    {


        on.setEnabled(true);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        plus.setEnabled(false);
        minus.setEnabled(false);
        div.setEnabled(false);
        multi.setEnabled(false);
        square.setEnabled(false);
        sqrt.setEnabled(false);
        cube.setEnabled(false);
        dot.setEnabled(false);
        equal.setEnabled(false);
        zero.setEnabled(false);
        del.setEnabled(false);
        clear.setEnabled(false);


    }
    public void enable()
    {
        of.setEnabled(true);
        on.setEnabled(false);
        text.setEditable(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        div.setEnabled(true);
        multi.setEnabled(true);
        square.setEnabled(true);
        sqrt.setEnabled(true);
        cube.setEnabled(true);
        dot.setEnabled(true);
        equal.setEnabled(true);
        zero.setEnabled(true);
        del.setEnabled(true);
        clear.setEnabled(true);
    }
}
