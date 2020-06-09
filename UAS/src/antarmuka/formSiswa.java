/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antarmuka;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;


/**
 *
 * @author rthkido
 */
public class formSiswa extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection con = koneksi.dbcon.Koneksi();
    /**
     * Creates new form formSiswa
     */
    public void judul(){
        Object[] judul = {
            "Id", 
            "No UN" ,
            "Nama",
            "Nama Orang Tua/Wali",
            "Alamat", 
            "Kabupaten", 
            "Asal Sekolah", 
            "Agama", 
            "MTK", 
            "B.Indo", 
            "B.Inggris",
            "IPA",
            "Jumlah UN", 
            "Pilihan 1", 
            "Pilihan 2"
        };
        tabModel = new DefaultTableModel(null, judul);
        tSiswa.setModel(tabModel);
    }
    
    public void tampilData(String where){
        try {
            st = con.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM biosiswa " + where);
            
            while (rs.next()){
                Object[] data = {
                    rs.getString("id"),
                    rs.getString("noun"),
                    rs.getString("nama"),
                    rs.getString("namaOrangTuaWali"),
                    rs.getString("alamat"),
                    rs.getString("kabupaten"),
                    rs.getString("asalSekolah"),
                    rs.getString("agama"),
                    rs.getString("nilaiMtk"),
                    rs.getString("nilaiBindo"),
                    rs.getString("nilaiBingg"),
                    rs.getString("nilaiIpa"),
                    rs.getString("sumun"),
                    rs.getString("pil1"),
                    rs.getString("pil2")
                };
                
                tabModel.addRow(data);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        inKode.setEnabled(false);
        btUpdate.setEnabled(false);
        btHapus.setEnabled(false);
        inPil1.setSelectedItem(null);
        inPil2.setSelectedItem(null);
    }
    
    public void reset(){
        inKode.setText("");
        inNoun.setText("");
        inNama.setText("");
        inNamaorg.setText(""); 
        inAlamat.setText(""); 
        inKabupaten.setText("");
        inAsalsekolah.setText(""); 
        inAgama.setText(""); 
        inMtk.setText(""); 
        inBindo.setText(""); 
        inBingg.setText(""); 
        inIpa.setText(""); 
        inSumun.setText("");
        inPil1.setSelectedItem(null);
        inPil2.setSelectedItem(null);
        btSimpan.setEnabled(true);
        
    }
    
    public void createCSV(String where){
        try {
            PrintWriter pw= new PrintWriter(new File("D:\\KULIAH\\test.txt"));
            StringBuilder sb=new StringBuilder();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM biosiswa " + where);
            while(rs.next()){
                sb.append(rs.getString("id"));
                sb.append(","); 
                sb.append(rs.getString("noun"));
                sb.append(",");
                sb.append(rs.getString("nama"));
                sb.append(",");
                sb.append(rs.getString("namaOrangTuaWali"));
                sb.append(",");
                sb.append(rs.getString("alamat"));
                sb.append(",");
                sb.append(rs.getString("kabupaten"));
                sb.append(",");
                sb.append(rs.getString("asalSekolah"));
                sb.append(",");
                sb.append(rs.getString("agama"));
                sb.append(",");
                sb.append(rs.getString("nilaiMtk"));
                sb.append(",");
                sb.append(rs.getString("nilaiBindo"));
                sb.append(",");
                sb.append(rs.getString("nilaiBingg"));
                sb.append(",");
                sb.append(rs.getString("nilaiIpa"));
                sb.append(",");
                sb.append(rs.getString("sumun"));
                sb.append(",");
                sb.append(rs.getString("pil1"));
                sb.append(",");
                sb.append(rs.getString("pil2"));
                sb.append("\r\n");
            }
            pw.write(sb.toString());
            pw.close();
            
            JOptionPane.showMessageDialog(null, "Export Berhasil");
            
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public formSiswa() {
        super("Aplikasi Pendataan PPDB SISWA 2020 SMK");
        initComponents();
        judul();
        tampilData("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        inNamaorg = new javax.swing.JTextField();
        inAlamat = new javax.swing.JTextField();
        inKabupaten = new javax.swing.JTextField();
        inAsalsekolah = new javax.swing.JTextField();
        inAgama = new javax.swing.JTextField();
        inNama = new javax.swing.JTextField();
        inNoun = new javax.swing.JTextField();
        inKode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tSiswa = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inBindo = new javax.swing.JTextField();
        inMtk = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        inBingg = new javax.swing.JTextField();
        inIpa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        inSumun = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        inPil1 = new javax.swing.JComboBox<>();
        inPil2 = new javax.swing.JComboBox<>();
        btSimpan = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel21.setText("jLabel21");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setBackground(new java.awt.Color(248, 148, 6));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI PENERIMAAN PESERTA DIDIK BARU ( PPDB ) SMK");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antarmuka/img/logo.png"))); // NOI18N
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 187, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 830, 150);

        jPanel5.setBackground(new java.awt.Color(52, 73, 94));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 830, 150);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        inAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inAgamaActionPerformed(evt);
            }
        });

        inNoun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNounActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(248, 148, 6));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("Export Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Title 2", "Title 3", "Title 4"
            }
        ));
        tSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tSiswa);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 214));
        jLabel11.setText("Nilai Siswa");

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 214));
        jLabel12.setText("Matematika");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 214));
        jLabel13.setText("Bahasa Indonesia");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 214));
        jLabel14.setText("Bahasa Inggris");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 214));
        jLabel15.setText("IPA");

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 214));
        jLabel16.setText("Jumlah");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 214));
        jLabel17.setText("Pilihan Jurusan");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 214));
        jLabel18.setText("Jurusan Pertama");

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 214));
        jLabel19.setText("Jurusan Kedua");

        inPil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TKJ", "RPL", "MULTIMEDIA" }));

        inPil2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TKJ", "RPL", "MULTIMEDIA" }));

        btSimpan.setBackground(new java.awt.Color(248, 148, 6));
        btSimpan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btUpdate.setBackground(new java.awt.Color(248, 148, 6));
        btUpdate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btHapus.setBackground(new java.awt.Color(248, 148, 6));
        btHapus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btReset.setBackground(new java.awt.Color(248, 148, 6));
        btReset.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 214));
        jLabel10.setText("Biodata Siswa");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 214));
        jLabel3.setText("Kode");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 214));
        jLabel4.setText("No UN");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 214));
        jLabel2.setText("Nama");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 214));
        jLabel5.setText("Nama Orangtua/Wali");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 214));
        jLabel6.setText("Alamat");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 214));
        jLabel7.setText("Kabupaten");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 214));
        jLabel8.setText("Asal Sekolah");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 214));
        jLabel9.setText("Agama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(248, 248, 248))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inNoun, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inKode, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inNama, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inNamaorg, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inKabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inAsalsekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(btSimpan))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inMtk, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inBindo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inPil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inPil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btUpdate)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inSumun, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inIpa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(47, 47, 47)
                                        .addComponent(inBingg, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btReset))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inKode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inMtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(inBingg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inNoun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(inBindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(inIpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inSumun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inNamaorg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(inPil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inKabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inPil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inAsalsekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSimpan)
                            .addComponent(btUpdate)
                            .addComponent(btHapus)
                            .addComponent(btReset))
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 150, 830, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        reset();
        tampilData("");
    }//GEN-LAST:event_btResetActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        try {
            int jawab;

            if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0){
                st = con.createStatement();
                st.executeUpdate("DELETE FROM biosiswa WHERE id='"
                    + tabModel.getValueAt(tSiswa.getSelectedRow(), 0) + "'");
                tampilData("");
                reset();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btHapusActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        try{
            //biodata
            String kode = inKode.getText();
            String noUn = inNoun.getText();
            String nama = inNama.getText();
            String namaorg = inNamaorg.getText();
            String alamat = inAlamat.getText();
            String kabupaten = inKabupaten.getText();
            String asalSekolah = inAsalsekolah.getText();
            String agama = inAgama.getText();
            //nilai un
            String mtk = inMtk.getText();
            String bindo = inBindo.getText();
            String bingg = inBingg.getText();
            String ipa = inIpa.getText();
            String sumun = inSumun.getText();
            //pil jurusan
            Object pil1 = inPil1.getSelectedItem();
            Object pil2 = inPil2.getSelectedItem();
            st = con.createStatement();
            st.executeUpdate("UPDATE biosiswa set "
                + "noun='" + noUn + "', "
                + "nama='" + nama + "', "
                + "namaOrangTuaWali='" + namaorg + "', "
                + "alamat='" + alamat + "', "
                + "kabupaten='" + kabupaten + "', "
                + "asalSekolah='" + asalSekolah + "', "
                + "agama='" + agama + "', "
                + "nilaiMtk='" + mtk + "', "
                + "nilaiBindo='" + bindo + "', "
                + "nilaiBingg='" + bingg + "', "
                + "nilaiIpa='" + ipa + "', "
                + "sumun='" + sumun + "', "
                + "pil1='" + pil1 + "', "
                + "pil2='" + pil2 +"' WHERE id='" + kode + "'");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Update Berhasil");
            reset();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        try{
            st = con.createStatement();
            String q = "SELECT max(id) as maks from biosiswa";
            rs = st.executeQuery(q);
            rs.next();
            int rowCount = rs.getInt("maks");
            rowCount = rowCount+1;
            st.executeUpdate("INSERT INTO biosiswa VALUES('" + rowCount + "','"
                + inNoun.getText() +"','"
                + inNama.getText() + "','"
                + inNamaorg.getText() +"','"
                + inAlamat.getText() +"','"
                + inKabupaten.getText() +"','"
                + inAsalsekolah.getText() +"','"
                + inAgama.getText()+ "','"
                + inMtk.getText() +"','"
                + inBindo.getText() + "','"
                + inBingg.getText() +"','"
                + inIpa.getText() +"','"
                + inSumun.getText()+ "','"
                + inPil1.getSelectedItem() +"','"
                + inPil2.getSelectedItem() +"')");

            //menyimpan nilai
            //            String w = "SELECT max(noun) as maks from unsiswa";
            //            rs = st.executeQuery(w);
            //            rs.next();
            //            int rowCount1 = rs.getInt("maks");
            //            rowCount1 = rowCount1+1;
            //            st.executeUpdate("INSERT INTO unsiswa VALUES('" + inNoun.getText() + "','"
                //                    + inMtk.getText() +"','"
                //                    + inBindo.getText() + "','"
                //                    + inBingg.getText() +"','"
                //                    + inIpa.getText() +"','"
                //                    + inSumun.getText() +"')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            inNama.setText("");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void tSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tSiswaMouseClicked
        // TODO add your handling code here:
        inKode.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 0).toString());
        inNoun.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 1).toString());
        inNama.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 2).toString());
        inNamaorg.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 3).toString());
        inAlamat.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 4).toString());
        inKabupaten.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 5).toString());
        inAsalsekolah.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 6).toString());
        inAgama.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 7).toString());
        inMtk.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 8).toString());
        inBindo.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 9).toString());
        inBingg.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 10).toString());
        inIpa.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 11).toString());
        inSumun.setText(tSiswa.getValueAt(tSiswa.getSelectedRow(), 12).toString());
        inPil1.setSelectedItem(tSiswa.getValueAt(tSiswa.getSelectedRow(), 13).toString());
        inPil2.setSelectedItem(tSiswa.getValueAt(tSiswa.getSelectedRow(), 14).toString());
        inKode.setEnabled(false);
        btSimpan.setEnabled(false);
        btUpdate.setEnabled(true);
        btHapus.setEnabled(true);
    }//GEN-LAST:event_tSiswaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        createCSV("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inNounActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNounActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNounActionPerformed

    private void inAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inAgamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inAgamaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btUpdate;
    private javax.swing.JTextField inAgama;
    private javax.swing.JTextField inAlamat;
    private javax.swing.JTextField inAsalsekolah;
    private javax.swing.JTextField inBindo;
    private javax.swing.JTextField inBingg;
    private javax.swing.JTextField inIpa;
    private javax.swing.JTextField inKabupaten;
    private javax.swing.JTextField inKode;
    private javax.swing.JTextField inMtk;
    private javax.swing.JTextField inNama;
    private javax.swing.JTextField inNamaorg;
    private javax.swing.JTextField inNoun;
    private javax.swing.JComboBox<String> inPil1;
    private javax.swing.JComboBox<String> inPil2;
    private javax.swing.JTextField inSumun;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tSiswa;
    // End of variables declaration//GEN-END:variables
}
