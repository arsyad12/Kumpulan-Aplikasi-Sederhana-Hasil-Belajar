Public Class Latihan1

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        '--- objek form
        Me.Text = "Latihan Program Mahasiswa"

        '--- label oy 
        Me.lblNpm.Text = "NPM"
        Me.lblNm.Text = "Nama Mahasiswa"
        Me.lblJur.Text = "Jurusan"
        Me.lblPjur.Text = "Penjelasan Jurusan"
        Me.lblDos.Text = "Dosen Wali"

        '--- button say

        Me.list.Text = "list"
        Me.clear.Text = "clear"
        Me.ext.Text = "exit"







    End Sub

    Private Sub list_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles list.Click
        Me.txtNpm.Text = "1755201065052415"
        Me.txtNm.Text = "MR. Ar"
        Me.txtJur.Text = "Teknik Informatika"
        Me.txtPjur.Text = "Teknik informatika adalah ..... Bagi kalian yang ingin memilih jurusan Teknik Informatika (TI), tetapi masih bingung apa sebenarnya Teknik Informatika itu. Disini ane akan bagi-bagi pengalaman kepada kalian. Ane sendiri adalah mantan mahasiswa Teknik Informatika di Universitas Gunadarma, beberapa orang bilang jurusan TI ini termasuk jurusan yang sulit. Benarkah? Okee mari simak pembahasan ane gan."
        Me.txtDos.Text = "MR. Yogi"
    End Sub

    Private Sub clear_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles clear.Click
        Me.txtNpm.Clear()
        Me.txtNm.Clear()
        Me.txtJur.Clear()
        Me.txtPjur.Clear()
        Me.txtDos.Clear()
    End Sub

    Private Sub ext_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ext.Click
        Me.Close()
    End Sub
End Class
