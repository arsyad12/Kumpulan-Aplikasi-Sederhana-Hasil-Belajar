Public Class hotel

    Private Sub hotel_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Me.Text = "Entri Data Hotel"
        Me.StartPosition = FormStartPosition.CenterScreen
        Me.sim.Enabled = False

    End Sub


    Private Sub cls_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles cls.Click
        Me.Close()
    End Sub

    Private Sub nw_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles nw.Click

        Me.txtLm.Clear()
        Me.txtHs.Clear()
        Me.txtBb.Clear()
        Me.txtJb.Clear()
        Me.txtKb.Clear()

    End Sub

    Private Sub txtJk_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtJk.SelectedIndexChanged
        If Me.txtJk.Text = "VIP" Then
            Me.txtHs.Text = 500000
        ElseIf Me.txtJk.Text = "ekonomi" Then
            Me.txtHs.Text = 260000
        ElseIf Me.txtJk.Text = "bisnis" Then
            Me.txtHs.Text = 360000
      
        End If

    End Sub

    Private Sub txtTtl_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtTtl.Click
        Dim b1, b2 As New Integer
        Dim h As New Double
        b1 = Val(Lm.Text)
        b2 = Val(hs.Text)
        h = b1 * b2
        txtBb.Text = h

    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim b3, b4 As New Integer
        Dim h As New Double
        b3 = Val(bb.Text)
        b4 = Val(jb.Text)
        h = b3 - b4
        txtBb.Text = h
    End Sub
End Class
