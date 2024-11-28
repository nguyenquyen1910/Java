package codeptitremake;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodePtit extends JFrame {
    private JTextField lengthField;
    private JTextField widthField;
    private JTextField areaField;
    private JTextField perimeterField;

    public CodePtit() {
        setTitle("Code PTIT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);

        JButton btnEx1 = new JButton("       HINH CHU NHAT       ");
        JButton btnEx2 = new JButton("    TINH TONG TU 1 TOI N   ");
        JButton btnEx3 = new JButton(" GIAI PHUONG TRINH BAC NHAT");
        JButton btnEx4 = new JButton("        SO NGUYEN TO       ");
        JButton btnEx5 = new JButton("     TINH SO FIBONACCI     ");

        btnEx1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveRectangle();
            }
        });

        btnEx2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveSum1ToN();
            }
        });

        btnEx3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveEquation();
            }
        });

        btnEx4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solvePrime();
            }
        });

        btnEx5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveFibonacci();
            }
        });

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(btnEx1)
                        .addComponent(btnEx2)
                        .addComponent(btnEx3)
                        .addComponent(btnEx4)
                        .addComponent(btnEx5))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(btnEx1)
                .addComponent(btnEx2)
                .addComponent(btnEx3)
                .addComponent(btnEx4)
                .addComponent(btnEx5)
        );

        add(panel);

    }


//Bai 1
    private void solveRectangle() {
        JLabel lengthLabel = new JLabel("Chieu dai:");
        JLabel widthLabel = new JLabel("Chieu rong:");
        JLabel areaLabel = new JLabel("Dien tich:");
        JLabel perimeterLabel = new JLabel("Chu vi:");

        lengthField = new JTextField(10);
        widthField = new JTextField(10);
        areaField = new JTextField(10);
        perimeterField = new JTextField(10);
        areaField.setEditable(false);
        perimeterField.setEditable(false);

        JButton btnSubmit = new JButton("Submit");
        JButton btnBack = new JButton("Back");

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caculatorAreaAndPerimater();
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBackToMainScreen();
            }
        });

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lengthLabel)
                        .addComponent(widthLabel)
                        .addComponent(areaLabel)
                        .addComponent(perimeterLabel)
                        .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lengthField)
                        .addComponent(widthField)
                        .addComponent(areaField)
                        .addComponent(perimeterField)
                        .addComponent(btnSubmit))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lengthLabel)
                        .addComponent(lengthField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(widthLabel)
                        .addComponent(widthField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(areaLabel)
                        .addComponent(areaField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(perimeterLabel)
                        .addComponent(perimeterField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(btnSubmit)
                )
        );

        getContentPane().removeAll();
        add(panel);
        revalidate();
        repaint();
    }

    private void caculatorAreaAndPerimater() {
        try {
            double length = Double.parseDouble(lengthField.getText());
            double width = Double.parseDouble(widthField.getText());

            double area = length * width;
            double perimeter = 2 * (length + width);

            areaField.setText(String.format("%.2f", area));
            perimeterField.setText(String.format("%.2f", perimeter));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nhap dung dinh dang", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

//Bai 2
    private void solveSum1ToN() {
        JLabel label = new JLabel("Nhap so N: ");
        JLabel sumLabel = new JLabel("Tong tu 1 den N: ");

        JTextField nField = new JTextField(10);
        JTextField sumField = new JTextField(10);
        sumField.setEditable(false);

        JButton btnSubmit = new JButton("Submit");
        JButton btnBack = new JButton("Back");

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(nField.getText());
                    long sum = (n * (n+1)) / 2;
                    sumField.setText(String.format("%.2f", sum));
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Nhap dung dinh dang so nguyen", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBackToMainScreen();
            }
        });

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(label)
                        .addComponent(sumLabel)
                        .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nField)
                        .addComponent(sumField)
                        .addComponent(btnSubmit))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(nField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(sumField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(btnSubmit))
        );

        getContentPane().removeAll();
        add(panel);
        revalidate();
        repaint();
    }

    private void goBackToMainScreen() {
        this.dispose();
        CodePtit mainScreen = new CodePtit();
        mainScreen.setVisible(true);
    }

//Bai 3
    private void solveEquation() {
        JLabel aLabel = new JLabel("Nhap so a:");
        JLabel bLabel = new JLabel("Nhap so b:");
        JLabel resultLabel = new JLabel("Ket qua phuong trinh ax+b=0: ");

        JTextField aField = new JTextField(10);
        JTextField bField = new JTextField(10);
        JTextField resField = new JTextField(10);
        resField.setEditable(false);

        JButton btnSubmit = new JButton("Submit");
        JButton btnBack = new JButton("Back");

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(aField.getText());
                    double b = Double.parseDouble(bField.getText());
                    String result;
                    if (a == 0) {
                        if (b == 0) {
                            result = "VSN";
                        } else {
                            result = "VN";
                        }
                    } else {
                        double x = -b / a;
                        result = String.format("%.2f", x);
                    }
                    resField.setText(result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Nhap dung dinh dang so thuc", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBackToMainScreen();
            }
        });

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(aLabel)
                        .addComponent(bLabel)
                        .addComponent(resultLabel)
                        .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(aField)
                        .addComponent(bField)
                        .addComponent(resField)
                        .addComponent(btnSubmit))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(aLabel)
                        .addComponent(aField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bLabel)
                        .addComponent(bField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(resultLabel)
                        .addComponent(resField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(btnSubmit))
        );

        getContentPane().removeAll();
        add(panel);
        revalidate();
        repaint();
    }

//Bai 4
    private void solvePrime() {
        JLabel label = new JLabel("Nhap 1 so nguyen duong N:");
        JLabel resultLabel = new JLabel("Ket qua: ");

        JTextField nField = new JTextField(10);
        JTextField rField = new JTextField(10);
        rField.setEditable(false);

        JButton btnSubmit = new JButton("Submit");
        JButton btnBack = new JButton("Back");

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(nField.getText());
                    if(isPrime(n)){
                        rField.setText("YES");
                    }
                    else{
                        rField.setText("NO");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Nhap dung dinh dang so nguyen", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBackToMainScreen();
            }
        });

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(label)
                        .addComponent(resultLabel)
                        .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nField)
                        .addComponent(rField)
                        .addComponent(btnSubmit))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(nField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(resultLabel)
                        .addComponent(rField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(btnSubmit))
        );

        getContentPane().removeAll();
        add(panel);
        revalidate();
        repaint();
    }

    private boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }

//Bai 5
    private void solveFibonacci() {
        JButton btnSubmit = new JButton("Submit");
        JButton btnBack = new JButton("Back");

        JTextField nField = new JTextField(10);
        JTextField resField = new JTextField(10);
        resField.setEditable(false);

        long[] fibo = new long[93];
        fibo[1]=1;
        fibo[2]=1;
        for(int i=3;i<=92;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int n = Integer.parseInt(nField.getText());
                    resField.setText(String.valueOf(fibo[n]));
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Nhap dung dinh dang so nguyen", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBackToMainScreen();
            }
        });

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nField)
                        .addComponent(resField)
                        .addComponent(btnSubmit))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(resField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(btnSubmit))
        );

        getContentPane().removeAll();
        add(panel);
        revalidate();
        repaint();
    }
}
