/**
 * 
 */
function myFunction() {
//	alert(URL);
	    if (window.confirm("Are you sure that you want to delete that item.")) {
	    	window.alert(this);
	    	window.location.href = '/';
	    	return true;
	    } else {
	    	window.alert(this);
	    	window.location.href = "/";
	    	return false;
	    }
	}