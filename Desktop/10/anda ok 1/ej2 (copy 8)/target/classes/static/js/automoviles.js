function loadInit(){
    var table = $('#tablaAutomoviles').DataTable({
        "scrollX": true, // Agrega desplazamiento horizontal
      "responsive": true, // Hace que la tabla sea responsive
        language: {
            "decimal":        "",
            "emptyTable":     "No hay datos disponibles en la tabla",
            "info":           "Mostrando _START_ a _END_ de _TOTAL_ registros",
            "infoEmpty":      "Mostrando 0 a 0 de 0 registros",
            "infoFiltered":   "(filtrados de un total de _MAX_ registros)",
            "infoPostFix":    "",
            "thousands":      ",",
            "lengthMenu":     "Mostrar _MENU_ registros",
            "loadingRecords": "Cargando...",
            "processing":     "Procesando...",
            "search":         "Buscar:",
            "zeroRecords":    "No se encontraron registros coincidentes",
            "paginate": {
                "first":      "Primera",
                "last":       "Última",
                "next":       "Siguiente",
                "previous":   "Anterior"
            },
            "aria": {
                "sortAscending":  ": activar para ordenar la columna en orden ascendente",
                "sortDescending": ": activar para ordenar la columna en orden descendente"
            }
        },
        lengthMenu: [ 8 , 15, 25, 50 ],
        pageLength: 8 // establece el número de registros por página
        
    });
    
      $('#filtroMarca').on('keyup', function() {
        table.column(1).search(this.value).draw();
      });
    
      $('#filtroDescripcion').on('keyup', function() {
        table.column(2).search(this.value).draw();
      });
    
      $('#filtroTipo').on('keyup', function() {
        table.column(3).search(this.value).draw();
      });
    
      $(".btn-delete").on("click", function (e) {
        e.preventDefault();
        link = $(this);
    
        automovilTitle = link.attr("automovilTitle");
        $("#yesBtn").attr("href", link.attr("href"));
        $("#confirmText").html("Do you want to delete the automovil \<strong\>" + automovilTitle + "\<\/strong\>?");
        $("#confirmModal").modal();
      });
    
      $("#btnClear").on("click", function (e) {
        e.preventDefault();
        $("#keyword").text("");
        window.location = "[[@{/automoviles}]]";
      });
      
      $('#btnMostrarOcultar').click(function() {
        $('#collapseDiv').toggle();
      });

      $('#btnCleanFilters').click(function() {
        $('#filtroMarca').val(''); 
        $('#filtroDescripcion').val(''); 
        $('#filtroTipo').val(''); 
        $('#tablaAutomoviles').DataTable().column(1).search('').draw();
        $('#tablaAutomoviles').DataTable().column(2).search('').draw();
        $('#tablaAutomoviles').DataTable().column(3).search('').draw();
      });
        
}

function getLogo( marca ){
  return "UbicacionIMAGE";
}

