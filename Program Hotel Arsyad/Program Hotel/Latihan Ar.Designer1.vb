Public Class Form1

    Private Sub GroupBox1_Enter(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GroupBox1.Enter
        '---  objek Form
        Me.Text = "Hotel"

    End Sub

    Private Sub nw_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles nw.Click


        Me.hs.Clear()
        Me.lm.Clear()
        Me.jb.Clear()
        Me.bs.Clear()
        Me.kb.Clear()
        Me.lm.Focus()

    End Sub

    Private Sub clse_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles clse.Click

        Me.Close()

    End Sub


    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ttl.Click
        Dim b1, b2, b3, b4 As New Integer
        Dim h As New Double
        b1 = Val(hs.Text)
        b2 = Val(lm.Text)
        h = b1 * b2
        bs.Text = h

    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim b1, b2, b3, b4 As New Integer
        Dim h As New Double

        b1 = Val(jb.Text)
        b2 = Val(bs.Text)
        h = b1 - b2
        kb.Text = h
    End Sub


    Private Sub jk_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles jk.SelectedIndexChanged

    End Sub
End Class
