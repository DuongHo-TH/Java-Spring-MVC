
/*$("#buttondelete").click(function(){
	 var  check =  confirm("Bạn có chắc chắn muốn xóa không");
	 if(check){
		 $.ajax({
                url: '${pageContext.request.contextPath}/deletemaytram?mayid=${may.getMamay()}', 
                type: 'GET'
	 }) 
	 }
})*/

function deleteData(id) {
		 var  check =  confirm("Bạn có chắc chắn muốn xóa không");
	 if(check){
		 $.ajax({
                url: 'deletemaytram?mayid=' + id, 
                type: 'GET',
                success: function(request) {
                   
                    }
	 }) 
	 }
}