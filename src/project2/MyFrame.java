package project2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{
    
    private JButton button, button3, button2, button4;
    private JTextField textfield, textfield2, textfield3, textfield4, textfield5,
                       textfield6, textfield7, textfield8, textfield9, textfield10;
    private JComboBox combobox, combobox2, combobox3;
    private String link;
    private String path;
    private BufferedWriter writer;
    private JLabel label, label2, label3;
    private ArrayList<Course> courses;
    private Instructor i, i1, i2, i3, i4, i5, i6, answer;
        
    
    public MyFrame() throws WriterException, IOException{
 
        this.setTitle("Register Form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(500, 400 );
        this.setBounds(500, 250, 500, 400);

        this.setLayout(null);
        
    label = new JLabel("This is for Students only.");
        label.setBounds(320,250 , 150, 25);
        label.setForeground(Color.white);
        
    label2 = new JLabel("This is for Students only.");
        label2.setBounds(320,150 , 150, 25);
        label2.setForeground(Color.white);
        
    label3 = new JLabel("This is for Students only.");
        label3.setBounds(320, 200, 150, 25);
        label3.setForeground(Color.white);
   
    button = new JButton("Submit");
        button.addActionListener(this);
        button.setHorizontalTextPosition(JLabel.CENTER);
        button.setVerticalTextPosition(JLabel.CENTER);
        button.setBounds(137, 280, 90, 40);
        button.setFont(new Font("", Font.BOLD, 15));
        
    button3 = new JButton("Add Course");
        button3.addActionListener(this);
        button3.setHorizontalTextPosition(JLabel.CENTER);
        button3.setVerticalTextPosition(JLabel.CENTER);
        button3.setBounds(90, 50, 200, 25);
        button3.setFont(new Font("", Font.BOLD, 15));
        
    button2 = new JButton("Confirm you Courses");
        button2.addActionListener(this);
        button2.setHorizontalTextPosition(JLabel.CENTER);
        button2.setVerticalTextPosition(JLabel.CENTER);
        button2.setBounds(90, 150, 200, 25);
        button2.setFont(new Font("", Font.BOLD, 15));
        
    button4 = new JButton("Show the Names of the Instructors");
        button4.addActionListener(this);
        button4.setHorizontalTextPosition(JLabel.CENTER);
        button4.setVerticalTextPosition(JLabel.CENTER);
        button4.setBounds(90, 150, 200, 25);
        button4.setFont(new Font("", Font.BOLD, 15));
    
    textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(250, 25));
        textfield.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield.setCaretColor(Color.black);
        textfield.setText("Student or Instructor Name");
        textfield.setBounds(50,20 , 250, 25);
        
    textfield2 = new JTextField();
        textfield2.setPreferredSize(new Dimension(250, 25));
        textfield2.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield2.setCaretColor(Color.black);
        textfield2.setText("Address");
        textfield2.setBounds(50,70 , 250, 25);
        
    textfield3 = new JTextField();
        textfield3.setPreferredSize(new Dimension(250, 25));
        textfield3.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield3.setCaretColor(Color.black);
        textfield3.setText("ID");
        textfield3.setBounds(320,70 , 150, 25);
        
    textfield4 = new JTextField();
        textfield4.setPreferredSize(new Dimension(250, 25));
        textfield4.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield4.setCaretColor(Color.black);
        textfield4.setText("Telephone_Number");
        textfield4.setBounds(50,170 , 250, 25);
        
    textfield5 = new JTextField();
        textfield5.setPreferredSize(new Dimension(250, 25));
        textfield5.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield5.setCaretColor(Color.black);
        textfield5.setText("Department");
        textfield5.setBounds(50,220 , 250, 25);
        
    textfield6 = new JTextField();
        textfield6.setPreferredSize(new Dimension(250, 25));
        textfield6.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield6.setCaretColor(Color.black);
        textfield6.setText("C:\\Users\\ahmed\\OneDrive\\Desktop\\QR_Code.png");
        textfield6.setBounds(50,120 , 250, 25);
    
    textfield7 = new JTextField();
        textfield7.setPreferredSize(new Dimension(250, 25));
        textfield7.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield7.setCaretColor(Color.black);
        textfield7.setText("C:\\Users\\ahmed\\OneDrive\\Desktop\\output.txt");
        textfield7.setBounds(320,120 , 150, 25);
    
    textfield8 = new JTextField();
        textfield8.setPreferredSize(new Dimension(250, 25));
        textfield8.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield8.setCaretColor(Color.black);
        textfield8.setText("BirthDay");
        textfield8.setBounds(320,270 , 150, 25);
    
    textfield9 = new JTextField();
        textfield9.setPreferredSize(new Dimension(250, 25));
        textfield9.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield9.setCaretColor(Color.black);
        textfield9.setText("Enrolled_Year");
        textfield9.setBounds(320,170 , 150, 25);
    
    textfield10 = new JTextField();
        textfield10.setPreferredSize(new Dimension(250, 25));
        textfield10.setFont(new Font("Consolas", Font.PLAIN, 15));
        textfield10.setCaretColor(Color.black);
        textfield10.setText("Semester");
        textfield10.setBounds(320, 220, 150, 25);
   
        String[] person = {"Student", "Instructor"};
    combobox = new JComboBox(person);
        combobox.addActionListener(this);
        combobox.setBounds(320,20 , 150, 25);
        
    String[] Courses = {"Data", "Programming2", "CS", "Numerical", "Probability2", "Math1"};
    combobox2 = new JComboBox(Courses);
        combobox2.addActionListener(this);
        combobox2.setBounds(90, 100, 150, 25);
        
    String[] Instructors_id = {"1", "2", "3", "4", "5", "6", "Me"};
    combobox3 = new JComboBox(Instructors_id);
        combobox3.addActionListener(this);
        combobox3.setBounds(90, 100, 150, 25);
            
        this.add(textfield);
        this.add(textfield2);
        this.add(textfield3);
        this.add(textfield4);
        this.add(textfield5);
        this.add(button);
        this.add(combobox);
        this.add(textfield6);
        this.add(textfield7);
        this.add(textfield9);
        this.add(textfield8);
        this.add(textfield10);
        this.add(label);
        this.add(label2);
        this.add(label3);
        this.setVisible(true);
        
        
        
    ImageIcon image = new ImageIcon("273-2734196_registration-logo-hd-png-download.jpg"); 
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x008351));
        
        
    }

@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button){
        
        path = textfield6.getText();
        link = textfield7.getText();
        
        try {
            writer = new BufferedWriter(new FileWriter(link));
        } catch (IOException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            generateQRcode( link, path, "UTF-8", 150, 150);
        } catch (WriterException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    ImageIcon image2 = new ImageIcon(path);
        
        if(combobox.getSelectedItem()=="Student"){
            
            Student s = new Student();
            s.name = textfield.getText();
            s.address = textfield2.getText();
            textfield3.setText(""+s.lastid);
            s.ID = s.lastid;
            s.telephone_number = textfield4.getText();
            s.department = textfield5.getText();
            s.BD = textfield8.getText();
            textfield9.setText("2020");
            s.enrolled_year = Integer.parseInt(textfield9.getText());
            s.semester = textfield10.getText();
            
            try {
                writer.write("Student name: "+s.name+"\nAdress: "+s.address+"\nID: "+s.ID+"\nDepartment: "+
                s.department+"\nTelephone_number: "+s.telephone_number+"\nYour BirthDay: "+s.BD+"\nEnrolled_Year: "+
                s.enrolled_year+"\nSemester: "+s.semester+"\n\n");
                
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Student name: "+s.name+"\nAdress: "+s.address+"\nID: "+
            s.ID+"\nDepartment: "+s.department+"\nTelephone_number: "+s.telephone_number+"\nYour BirthDay: "+s.BD+"\nEnrolled_Year: "+
            s.enrolled_year+"\nSemester: "+s.semester , "Your info", JOptionPane.INFORMATION_MESSAGE);
            
            this.add(button3);
            this.add(combobox2);
            this.add(button2);
            
            this.setSize(400, 300);

        JOptionPane.showMessageDialog(null, image2, "QR_code", JOptionPane.INFORMATION_MESSAGE);
            
        }else if(combobox.getSelectedItem()=="Instructor"){
            
            i = new Instructor();
            i.name = textfield.getText();
            i.address = textfield2.getText();
            textfield3.setText("1");
            i.ID = Integer.parseInt(textfield3.getText());
            i.telephone_number = textfield4.getText();
            i.department = textfield5.getText();
            
            try {
                writer.write("Instructor name: "+i.name+"\nAdress: "+i.address+"\nID: "+i.ID+"\nDepartment: "+i.department+
                "\nTelephone_number: "+i.telephone_number+"\n\n");
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Instructor name: "+i.name+"\nAdress: "+i.address+"\nID: "+i.ID+
            "\nDepartment: "+i.department+"\nTelephone_number: "+i.telephone_number, "Your info", JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null, image2, "QR_code", JOptionPane.INFORMATION_MESSAGE);
            
            this.add(button4);
            this.add(combobox3);
            
            this.setSize(400, 300);
            
        }
        
        textfield.hide();textfield2.hide();textfield3.hide();textfield4.hide();textfield5.hide();combobox.hide();button.hide();
        textfield6.hide();textfield7.hide();textfield9.hide();textfield8.hide();textfield10.hide();label.hide();label2.hide();label3.hide();

    }

    if(e.getSource()==button3){

        courses = new ArrayList<>();

        Department ds = new Department();
        ds.setName("Data structure");
        Department Cs = new Department();
        Cs.setName("Computer Science");
        
        i1= new Instructor("ahmed",1,"dd","01204455011","ds");
        i2= new Instructor("hassan",2,"nn","01269564006","ds");
        i3= new Instructor("mohamed",3,"mm","01099345764","ds");
        i4= new Instructor("essra",4,"pp","01128945096","cs");
        i5= new Instructor("sara",5,"oo","01023789456","cs");
        i6= new Instructor("Mark",6,"oo","01055789456","cs");
        
        Classroom a=new Classroom();
        a.setNumbuerofclass(401);
        Classroom b=new Classroom();
        b.setNumbuerofclass(402);
        Classroom g=new Classroom();
        g.setNumbuerofclass(403);
        Classroom d=new Classroom();
        d.setNumbuerofclass(404);
        Classroom o=new Classroom();
        o.setNumbuerofclass(405);
        
        
        if(combobox2.getSelectedItem()=="Data"){
            
            Course c1 = new Course("data",0,i1,2,3,a,2,"programming2","Data and algorithm",ds);
            courses.add(c1);
            
            try {
                writer.write(courses.toString()+"\n");
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            JOptionPane.showMessageDialog(null, "You added the "+"Data"+
            " Course", "The Added Course", JOptionPane.INFORMATION_MESSAGE);
            
        }
        if(combobox2.getSelectedItem()=="Programming2"){
            
            Course c2 = new Course("programming2",3,i4,1,3,d,5,"programming1","intro to java",Cs);
            courses.add(c2);
            
            try {
                writer.write(courses.toString()+"\n");
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "You added the "+"Programming2"+
            " Course", "The Added Course", JOptionPane.INFORMATION_MESSAGE);
        }
        if(combobox2.getSelectedItem()=="CS"){
            
            Course c3 = new Course("cs",1,i2,1,3,b,3,"introcs","computersystembook",Cs);
            courses.add(c3);
            
            try {
                writer.write(courses.toString()+"\n");
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "You added the "+"CS"+
            " Course", "The Added Course", JOptionPane.INFORMATION_MESSAGE);
        }
        if(combobox2.getSelectedItem()=="Numerical"){
            
            Course c4 = new Course("Numerical",2,i3,2,3,g,1,"Linear algebra","Numerical and number theory",ds);
            courses.add(c4);
            
            try {
                writer.write(courses.toString()+"\n");
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "You added the "+"Numerical"+
            " Course", "The Added Course", JOptionPane.INFORMATION_MESSAGE);
        }
        if(combobox2.getSelectedItem()=="Probability2"){
            
            Course c5 = new Course("probability2",4,i5,2,3,o,1,"probability1"," probabilty2 book",ds);
            courses.add(c5);
            
            try {
                writer.write(courses.toString()+"\n");
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "You added the "+"Probability2"+
            " Course", "The Added Course", JOptionPane.INFORMATION_MESSAGE);
            
        }
        if(combobox2.getSelectedItem()=="Math1"){
            
            Course c6 = new Course("Math1",5,i6,1,3,g,3,"Math0","intro to math1",ds);
            courses.add(c6);
            
            try {
                writer.write(courses.toString()+"\n");
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "You added the "+"Math1"+
            " Course", "The Added Course", JOptionPane.INFORMATION_MESSAGE);
            
        }   
    }
    
    if(e.getSource()==button2){
       try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    answer = i;
    
    if(combobox3.getSelectedItem()=="1"){
        i1= new Instructor("ahmed",1,"dd","01204455011","ds");
        answer = i1;
    }
    if(combobox3.getSelectedItem()=="2"){
        i2= new Instructor("hassan",2,"nn","01269564006","ds");
        answer = i2;
    }
    if(combobox3.getSelectedItem()=="3"){
        i3= new Instructor("mohamed",3,"mm","01099345764","ds");
        answer = i3;
    }
    if(combobox3.getSelectedItem()=="4"){
        i4= new Instructor("essra",4,"pp","01128945096","cs");
        answer = i4;
    }
    if(combobox3.getSelectedItem()=="5"){
        i5= new Instructor("sara",5,"oo","01023789456","cs");
        answer = i5;
    }
    if(combobox3.getSelectedItem()=="6"){
        i6= new Instructor("Mark",6,"oo","01055789456","cs");
        answer = i6;
    }
    if(combobox3.getSelectedItem()=="Me"){
        answer = i;
    }
    
    if(e.getSource()==button4){
       try {
                writer.write(answer.toString()+"\n");
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
       JOptionPane.showMessageDialog(null, answer.toString(), "Instructor info", JOptionPane.INFORMATION_MESSAGE);
    }
     
  }

public static void generateQRcode(String data, String path, String charset, int h, int w) throws WriterException, IOException{
        
    BitMatrix bitmatrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, w, h);
        
    MatrixToImageWriter.writeToPath(bitmatrix, path.substring(path.lastIndexOf('.')+1), Paths.get(path));
        
 }

}
