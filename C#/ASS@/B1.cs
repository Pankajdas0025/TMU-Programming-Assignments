using System;

private void btnCalculate_Click(object sender, EventArgs e)
{
    double r = Convert.ToDouble(txtRadius.Text);
    double area = Math.PI * r * r;
    lblResult.Text = "Area = " + area;
}