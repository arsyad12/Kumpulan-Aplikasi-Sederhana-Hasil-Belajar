<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class hotel
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.jk = New System.Windows.Forms.Label
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.txtKb = New System.Windows.Forms.TextBox
        Me.txtJb = New System.Windows.Forms.TextBox
        Me.txtBb = New System.Windows.Forms.TextBox
        Me.txtHs = New System.Windows.Forms.TextBox
        Me.txtLm = New System.Windows.Forms.TextBox
        Me.txtJk = New System.Windows.Forms.ComboBox
        Me.kb = New System.Windows.Forms.Label
        Me.jb = New System.Windows.Forms.Label
        Me.bb = New System.Windows.Forms.Label
        Me.hs = New System.Windows.Forms.Label
        Me.Lm = New System.Windows.Forms.Label
        Me.kembalian = New System.Windows.Forms.GroupBox
        Me.cls = New System.Windows.Forms.Button
        Me.nw = New System.Windows.Forms.Button
        Me.sim = New System.Windows.Forms.Button
        Me.txtTtl = New System.Windows.Forms.Button
        Me.Button1 = New System.Windows.Forms.Button
        Me.GroupBox1.SuspendLayout()
        Me.kembalian.SuspendLayout()
        Me.SuspendLayout()
        '
        'jk
        '
        Me.jk.AutoSize = True
        Me.jk.Location = New System.Drawing.Point(6, 37)
        Me.jk.Name = "jk"
        Me.jk.Size = New System.Drawing.Size(64, 13)
        Me.jk.TabIndex = 0
        Me.jk.Text = "Jenis Kamar"
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.txtKb)
        Me.GroupBox1.Controls.Add(Me.txtJb)
        Me.GroupBox1.Controls.Add(Me.txtBb)
        Me.GroupBox1.Controls.Add(Me.txtHs)
        Me.GroupBox1.Controls.Add(Me.txtLm)
        Me.GroupBox1.Controls.Add(Me.txtJk)
        Me.GroupBox1.Controls.Add(Me.kb)
        Me.GroupBox1.Controls.Add(Me.jb)
        Me.GroupBox1.Controls.Add(Me.bb)
        Me.GroupBox1.Controls.Add(Me.hs)
        Me.GroupBox1.Controls.Add(Me.Lm)
        Me.GroupBox1.Controls.Add(Me.jk)
        Me.GroupBox1.Location = New System.Drawing.Point(12, 12)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(966, 351)
        Me.GroupBox1.TabIndex = 1
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Hotel dengan fungsi IF"
        '
        'txtKb
        '
        Me.txtKb.Location = New System.Drawing.Point(127, 315)
        Me.txtKb.Name = "txtKb"
        Me.txtKb.Size = New System.Drawing.Size(327, 20)
        Me.txtKb.TabIndex = 11
        '
        'txtJb
        '
        Me.txtJb.Location = New System.Drawing.Point(127, 258)
        Me.txtJb.Name = "txtJb"
        Me.txtJb.Size = New System.Drawing.Size(327, 20)
        Me.txtJb.TabIndex = 10
        '
        'txtBb
        '
        Me.txtBb.Location = New System.Drawing.Point(127, 194)
        Me.txtBb.Name = "txtBb"
        Me.txtBb.Size = New System.Drawing.Size(327, 20)
        Me.txtBb.TabIndex = 9
        '
        'txtHs
        '
        Me.txtHs.Location = New System.Drawing.Point(127, 141)
        Me.txtHs.Name = "txtHs"
        Me.txtHs.Size = New System.Drawing.Size(327, 20)
        Me.txtHs.TabIndex = 8
        '
        'txtLm
        '
        Me.txtLm.Location = New System.Drawing.Point(127, 88)
        Me.txtLm.Name = "txtLm"
        Me.txtLm.Size = New System.Drawing.Size(327, 20)
        Me.txtLm.TabIndex = 7
        '
        'txtJk
        '
        Me.txtJk.FormattingEnabled = True
        Me.txtJk.Items.AddRange(New Object() {"VIP", "ekonomi", "bisnis"})
        Me.txtJk.Location = New System.Drawing.Point(127, 37)
        Me.txtJk.Name = "txtJk"
        Me.txtJk.Size = New System.Drawing.Size(152, 21)
        Me.txtJk.TabIndex = 6
        '
        'kb
        '
        Me.kb.AutoSize = True
        Me.kb.Location = New System.Drawing.Point(6, 322)
        Me.kb.Name = "kb"
        Me.kb.Size = New System.Drawing.Size(55, 13)
        Me.kb.TabIndex = 5
        Me.kb.Text = "kembalian"
        '
        'jb
        '
        Me.jb.AutoSize = True
        Me.jb.Location = New System.Drawing.Point(6, 261)
        Me.jb.Name = "jb"
        Me.jb.Size = New System.Drawing.Size(66, 13)
        Me.jb.TabIndex = 4
        Me.jb.Text = "jumlah bayar"
        '
        'bb
        '
        Me.bb.AutoSize = True
        Me.bb.Location = New System.Drawing.Point(6, 201)
        Me.bb.Name = "bb"
        Me.bb.Size = New System.Drawing.Size(64, 13)
        Me.bb.TabIndex = 3
        Me.bb.Text = "biaya  bayar"
        '
        'hs
        '
        Me.hs.AutoSize = True
        Me.hs.Location = New System.Drawing.Point(6, 144)
        Me.hs.Name = "hs"
        Me.hs.Size = New System.Drawing.Size(97, 13)
        Me.hs.TabIndex = 2
        Me.hs.Text = "harga sewa perhari"
        '
        'Lm
        '
        Me.Lm.AutoSize = True
        Me.Lm.Location = New System.Drawing.Point(6, 88)
        Me.Lm.Name = "Lm"
        Me.Lm.Size = New System.Drawing.Size(57, 13)
        Me.Lm.TabIndex = 1
        Me.Lm.Text = "Lama Inap"
        '
        'kembalian
        '
        Me.kembalian.Controls.Add(Me.Button1)
        Me.kembalian.Controls.Add(Me.txtTtl)
        Me.kembalian.Controls.Add(Me.cls)
        Me.kembalian.Controls.Add(Me.nw)
        Me.kembalian.Controls.Add(Me.sim)
        Me.kembalian.Location = New System.Drawing.Point(39, 397)
        Me.kembalian.Name = "kembalian"
        Me.kembalian.Size = New System.Drawing.Size(561, 190)
        Me.kembalian.TabIndex = 2
        Me.kembalian.TabStop = False
        Me.kembalian.Text = "GroupBox2"
        '
        'cls
        '
        Me.cls.Location = New System.Drawing.Point(301, 53)
        Me.cls.Name = "cls"
        Me.cls.Size = New System.Drawing.Size(75, 23)
        Me.cls.TabIndex = 2
        Me.cls.Text = "close"
        Me.cls.UseVisualStyleBackColor = True
        '
        'nw
        '
        Me.nw.Location = New System.Drawing.Point(159, 53)
        Me.nw.Name = "nw"
        Me.nw.Size = New System.Drawing.Size(75, 23)
        Me.nw.TabIndex = 1
        Me.nw.Text = "new"
        Me.nw.UseVisualStyleBackColor = True
        '
        'sim
        '
        Me.sim.Location = New System.Drawing.Point(33, 53)
        Me.sim.Name = "sim"
        Me.sim.Size = New System.Drawing.Size(75, 23)
        Me.sim.TabIndex = 0
        Me.sim.Text = "simpan"
        Me.sim.UseVisualStyleBackColor = True
        '
        'txtTtl
        '
        Me.txtTtl.Location = New System.Drawing.Point(437, 53)
        Me.txtTtl.Name = "txtTtl"
        Me.txtTtl.Size = New System.Drawing.Size(75, 23)
        Me.txtTtl.TabIndex = 3
        Me.txtTtl.Text = "total"
        Me.txtTtl.UseVisualStyleBackColor = True
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(33, 116)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(75, 23)
        Me.Button1.TabIndex = 4
        Me.Button1.Text = "Kembali"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'hotel
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(990, 610)
        Me.Controls.Add(Me.kembalian)
        Me.Controls.Add(Me.GroupBox1)
        Me.Name = "hotel"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Form1"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.kembalian.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents jk As System.Windows.Forms.Label
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents txtKb As System.Windows.Forms.TextBox
    Friend WithEvents txtJb As System.Windows.Forms.TextBox
    Friend WithEvents txtBb As System.Windows.Forms.TextBox
    Friend WithEvents txtHs As System.Windows.Forms.TextBox
    Friend WithEvents txtLm As System.Windows.Forms.TextBox
    Friend WithEvents txtJk As System.Windows.Forms.ComboBox
    Friend WithEvents kb As System.Windows.Forms.Label
    Friend WithEvents jb As System.Windows.Forms.Label
    Friend WithEvents bb As System.Windows.Forms.Label
    Friend WithEvents hs As System.Windows.Forms.Label
    Friend WithEvents Lm As System.Windows.Forms.Label
    Friend WithEvents kembalian As System.Windows.Forms.GroupBox
    Friend WithEvents cls As System.Windows.Forms.Button
    Friend WithEvents nw As System.Windows.Forms.Button
    Friend WithEvents sim As System.Windows.Forms.Button
    Friend WithEvents txtTtl As System.Windows.Forms.Button
    Friend WithEvents Button1 As System.Windows.Forms.Button

End Class
