
 ClassicEditor
	.create(document.querySelector('#content'))
	.then( editor => {
		console.log(editor);
	})
	
	.catch(erro => {
		console.error(error);
	});
	