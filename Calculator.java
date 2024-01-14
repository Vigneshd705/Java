package prg_java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button bt0;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9,plus,minus,div,mul,clear,equals;
    Calculator()
    {
        display = new TextField("0");
        display.setBounds(50,50,200,30);

        bt0 = new Button("0");
        bt0.setBounds(50,50,400,50);
        bt0.addActionListener(this);

        bt1 = new Button("1");
        bt1.setBounds(50,50,400,50);
        bt1.addActionListener(this);

        bt2 = new Button("2");
        bt2.setBounds(50,50,400,50);
        bt2.addActionListener(this);

        bt3 = new Button("3");
        bt3.setBounds(50,50,400,50);
        bt3.addActionListener(this);

        bt4 = new Button("4");
        bt4.setBounds(50,50,400,50);
        bt4.addActionListener(this);

        bt5 = new Button("5");
        bt5.setBounds(50,50,400,50);
        bt5.addActionListener(this);

        bt6 = new Button("6");
        bt6.setBounds(50,50,400,50);
        bt6.addActionListener(this);

        bt7 = new Button("7");
        bt7.setBounds(50,50,400,50);
        bt7.addActionListener(this);

        bt8 = new Button("8");
        bt8.setBounds(50,50,400,50);
        bt8.addActionListener(this);

        bt9 = new Button("9");
        bt9.setBounds(50,50,400,50);
        bt9.addActionListener(this);

        plus = new Button("+");
        plus.setBounds(50,50,400,50);
        plus.addActionListener(this);

        minus = new Button("-");
        minus.setBounds(50,50,400,50);
        minus.addActionListener(this);

        div = new Button("/");
        div.setBounds(50,50,400,50);
        div.addActionListener(this);

        mul = new Button("X");
        mul.setBounds(50,50,400,50);
        mul.addActionListener(this);

        clear = new Button("C");
        clear.setBounds(50,50,400,50);
        clear.addActionListener(this);

        equals = new Button("=");
        equals.setBounds(50,50,400,50);
        equals.addActionListener(this);

        setSize(500,800);
        setLayout(null);
        setTitle("Calculator");
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt0)
        {
            String expression = display.getText();
            expression+="0";
            display.setText(expression);
        }

        if(e.getSource()==bt1)
        {
            String expression = display.getText();
            expression+="1";
            display.setText(expression);
        }

        if(e.getSource()==bt2)
        {
            String expression = display.getText();
            expression+="2";
            display.setText(expression);
        }

        if(e.getSource()==bt3)
        {
            String expression = display.getText();
            expression+="3";
            display.setText(expression);
        }

        if(e.getSource()==bt4)
        {
            String expression = display.getText();
            expression+="4";
            display.setText(expression);
        }

        if(e.getSource()==bt5)
        {
            String expression = display.getText();
            expression+="5";
            display.setText(expression);
        }

        if(e.getSource()==bt6)
        {
            String expression = display.getText();
            expression+="6";
            display.setText(expression);
        }

        if(e.getSource()==bt7)
        {
            String expression = display.getText();
            expression+="7";
            display.setText(expression);
        }

        if(e.getSource()==bt8)
        {
            String expression = display.getText();
            expression+="8";
            display.setText(expression);
        }

        if(e.getSource()==bt9)
        {
            String expression = display.getText();
            expression+="9";
            display.setText(expression);
        }

        if(e.getSource()==plus)
        {
            String expression = display.getText();
            expression+="+";
            display.setText(expression);
        }  

        if(e.getSource()==minus)
        {
            String expression = display.getText();
            expression+="-";
            display.setText(expression);
        } 

        if(e.getSource()==mul)
        {
            String expression = display.getText();
            expression+="X";
            display.setText(expression);
        }

        if(e.getSource()==div)
        {
            String expression = display.getText();
            expression+="/";
            display.setText(expression);
        }

        if(e.getSource()==clear)
            display.setText("0");

        if(e.getSource()==equals)
        {
           int a ,b ,i;
           char operator =' ';
           String expression = display.getText();
           String tempA = "",tempB = "";
           for(i =0 ;i<expression.length();i++)
           {
                if(Character.isDigit(expression.charAt(i)))
                {
                    tempA += expression.charAt(i);
                }
                else
                {
                    operator = expression.charAt(i);
                    break;
                }
           }
           tempB = expression.substring(i+1);
           a = Integer.parseInt(tempA);
           b = Integer.parseInt(tempB);

           int result=0,flag=0;
           float result1=0.0f;

           switch(operator)
           {
                case '+' :  result = a+b;
                            break;

                case '-' :  result = a-b;
                            break;

                case 'X' :  result = a*b;
                            break;

                case '/' :  result1 = a/b;
                            flag = 1;
                            break;
           }
           if(flag==0)
           display.setText(String.valueOf(result));
           else
           display.setText(String.valueOf(result1));
           flag =0;
        }
    }
}

class Main
{
    public static void main(String[] args) {
        new Calculator();
    }
}
