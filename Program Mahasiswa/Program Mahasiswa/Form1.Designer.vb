<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Latihan1
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
        Me.lblNpm = New System.Windows.Forms.Label
        Me.lblNm = New System.Windows.Forms.Label
        Me.lblJur = New System.Windows.Forms.Label
        Me.lblPjur = New System.Windows.Forms.Label
        Me.lblDos = New System.Windows.Forms.Label
        Me.txtNpm = New System.Windows.Forms.TextBox
        Me.txtNm = New System.Windows.Forms.TextBox
        Me.txtJur = New System.Windows.Forms.TextBox
        Me.txtPjur = New System.Windows.Forms.TextBox
        Me.txtDos = New System.Windows.Forms.TextBox
        Me.list = New System.Windows.Forms.Button
        Me.clear = New System.Windows.Forms.Button
        Me.ext = New System.Windows.Forms.Button
        Me.SuspendLayout()
        '
        'lblNpm
        '
        Me.lblNpm.AutoSize = True
        Me.lblNpm.Location = New System.Drawing.Point(58, 50)
        Me.lblNpm.Name = "lblNpm"
        Me.lblNpm.Size = New System.Drawing.Size(39, 13)
        Me.lblNpm.TabIndex = 0
        Me.lblNpm.Text = "Label1"
        '
        'lblNm
        '
        Me.lblNm.AutoSize = True
        Me.lblNm.Location = New System.Drawing.Point(58, 92)
        Me.lblNm.Name = "lblNm"
        Me.lblNm.Size = New System.Drawing.Size(39, 13)
        Me.lblNm.TabIndex = 1
        Me.lblNm.Text = "Label2"
        '
        'lblJur
        '
        Me.lblJur.AutoSize = True
        Me.lblJur.Location = New System.Drawing.Point(58, 140)
        Me.lblJur.Name = "lblJur"
        Me.lblJur.Size = New System.Drawing.Size(39, 13)
        Me.lblJur.TabIndex = 2
        Me.lblJur.Text = "Label3"
        '
        'lblPjur
        '
        Me.lblPjur.AutoSize = True
        Me.lblPjur.Location = New System.Drawing.Point(58, 186)
        Me.lblPjur.Name = "lblPjur"
        Me.lblPjur.Size = New System.Drawing.Size(39, 13)
        Me.lblPjur.TabIndex = 3
        Me.lblPjur.Text = "Label4"
        '
        'lblDos
        '
        Me.lblDos.AutoSize = True
        Me.lblDos.Location = New System.Drawing.Point(58, 272)
        Me.lblDos.Name = "lblDos"
        Me.lblDos.Size = New System.Drawing.Size(39, 13)
        Me.lblDos.TabIndex = 4
        Me.lblDos.Text = "Label5"
        '
        'txtNpm
        '
        Me.txtNpm.Location = New System.Drawing.Point(348, 40)
        Me.txtNpm.Name = "txtNpm"
        Me.txtNpm.Size = New System.Drawing.Size(459, 20)
        Me.txtNpm.TabIndex = 5
        '
        'txtNm
        '
        Me.txtNm.Location = New System.Drawing.Point(348, 85)
        Me.txtNm.Name = "txtNm"
        Me.txtNm.Size = New System.Drawing.Size(459, 20)
        Me.txtNm.TabIndex = 6
        '
        'txtJur
        '
        Me.txtJur.Location = New System.Drawing.Point(348, 133)
        Me.txtJur.Name = "txtJur"
        Me.txtJur.Size = New System.Drawing.Size(459, 20)
        Me.txtJur.TabIndex = 7
        '
        'txtPjur
        '
        Me.txtPjur.Location = New System.Drawing.Point(348, 186)
        Me.txtPjur.Multiline = True
        Me.txtPjur.Name = "txtPjur"
        Me.txtPjur.ScrollBars = System.Windows.Forms.ScrollBars.Vertical
        Me.txtPjur.Size = New System.Drawing.Size(459, 63)
        Me.txtPjur.TabIndex = 8
        '
        'txtDos
        '
        Me.txtDos.Location = New System.Drawing.Point(348, 265)
        Me.txtDos.Name = "txtDos"
        Me.txtDos.Size = New System.Drawing.Size(459, 20)
        Me.txtDos.TabIndex = 9
        '
        'list
        '
        Me.list.Location = New System.Drawing.Point(355, 350)
        Me.list.Name = "list"
        Me.list.Size = New System.Drawing.Size(142, 34)
        Me.list.TabIndex = 10
        Me.list.Text = "Button1"
        Me.list.UseVisualStyleBackColor = True
        '
        'clear
        '
        Me.clear.Location = New System.Drawing.Point(533, 350)
        Me.clear.Name = "clear"
        Me.clear.Size = New System.Drawing.Size(142, 34)
        Me.clear.TabIndex = 11
        Me.clear.Text = "Button2"
        Me.clear.UseVisualStyleBackColor = True
        '
        'ext
        '
        Me.ext.Location = New System.Drawing.Point(700, 350)
        Me.ext.Name = "ext"
        Me.ext.Size = New System.Drawing.Size(142, 34)
        Me.ext.TabIndex = 12
        Me.ext.Text = "Button3"
        Me.ext.UseVisualStyleBackColor = True
        '
        'Latihan1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1048, 476)
        Me.Controls.Add(Me.ext)
        Me.Controls.Add(Me.clear)
        Me.Controls.Add(Me.list)
        Me.Controls.Add(Me.txtDos)
        Me.Controls.Add(Me.txtPjur)
        Me.Controls.Add(Me.txtJur)
        Me.Controls.Add(Me.txtNm)
        Me.Controls.Add(Me.txtNpm)
        Me.Controls.Add(Me.lblDos)
        Me.Controls.Add(Me.lblPjur)
        Me.Controls.Add(Me.lblJur)
        Me.Controls.Add(Me.lblNm)
        Me.Controls.Add(Me.lblNpm)
        Me.Name = "Latihan1"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents lblNpm As System.Windows.Forms.Label
    Friend WithEvents lblNm As System.Windows.Forms.Label
    Friend WithEvents lblJur As System.Windows.Forms.Label
    Friend WithEvents lblPjur As System.Windows.Forms.Label
    Friend WithEvents lblDos As System.Windows.Forms.Label
    Friend WithEvents txtNpm As System.Windows.Forms.TextBox
    Friend WithEvents txtNm As System.Windows.Forms.TextBox
    Friend WithEvents txtJur As System.Windows.Forms.TextBox
    Friend WithEvents txtPjur As System.Windows.Forms.TextBox
    Friend WithEvents txtDos As System.Windows.Forms.TextBox
    Friend WithEvents list As System.Windows.Forms.Button
    Friend WithEvents clear As System.Windows.Forms.Button
    Friend WithEvents ext As System.Windows.Forms.Button

End Class
