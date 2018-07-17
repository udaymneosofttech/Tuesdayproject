<h1 style="text-align:center;color:red">Registration page</h1>

<form action="#" method="get">
<table align="center" border="0">
<tr><td>Firstname:</td>
<td><input type="text" name="fname" max="10"></td></tr>

<tr><td>
Last Name:</td><td><input type="text" name="lname" max="10">
</td></tr>
<tr><td>
useranme:</td><td><input type="text" name="uname" max="10">
</td></tr>
<tr><td>
password:</td><td><strong><input type="password" name="pwd" min="5" max="10"/></strong>
</td></tr>
<tr><td>
Re-Enterpassword:</td><td> <strong><input type="text" name="rpwd" min="5" max="10"/></strong>
</td></tr>
<tr><td>
Mobile Number:</td><td><input type="text" name="mobieno" maxlength=10/>
</td></tr>
<tr><td>
Date:</td><td><input type="date" name="dob"/>
</td></tr>
<tr><td>
Email:</td><td><input type="text" name="email" >
</td></tr>

<tr><td>Gender:<input type="radio" name="gender" value="male" checked/>M</td>
<td>
       <input type="radio" name="gender" value="Female"/>F
       </td>
  
       </tr>
       <tr><td>state:
<select name="state">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="fiat">Fiat</option>
  <option value="audi">Audi</option>
</select> 

<tr  style="text-align:center"><td>
<input type="submit" value="Register"/></td></tr>
</table>
</form>