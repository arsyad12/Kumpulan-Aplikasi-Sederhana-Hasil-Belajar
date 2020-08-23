Public Class Form1

    Private Sub TextBox1_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles TextBox1.TextChanged
        Me.Text = "Laihan Data base"
    End Sub

  
    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim tnama, tpass, cb_katagori, tuser
        If tnama.Text = "" Or tpass.Text = "" Or cb_katagori.Text = "" Then
            MsgBox("Data Masih Ada yang Kosong !", MsgBoxStyle.Critical, "Programer Junior")
            tnama.Focus()
        Else
            koneksi.Close()
            buka()
            cmd.Connection = koneksi
            cmd.CommandType = CommandType.Text
            cmd.CommandText = "Insert into tbuser (user_id,nm_user,pass,hak_akses) values ('" & tuser.Text & "','" & tnama.Text & "', '" & cb_katagori.Text & "')"
            cmd.ExecuteNonQuery()
            MsgBox("Berhasil-Berhasil !", MsgBoxStyle.Information, "Programer Junior")

        End If
    End Sub
End Class
