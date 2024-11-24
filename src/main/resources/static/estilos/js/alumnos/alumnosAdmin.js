document.addEventListener('DOMContentLoaded', () => {
    inicio();
    muestraTabla();
});

function muestraTabla() {
    $tabla_alumnos = $('#table_alumnos').dataTable({
        "ajax": {
            "url": "alumnos/listarAlumnos",
            "method": "GET",
            "dataSrc": ""
        },
        "responsive": true,
        "bPaginate": true,
        "select": true,
        "language": {
            "processing": "Procesando...",
            "sProcessing": "Procesando...",
            "sLengthMenu": "Mostrar _MENU_ registros",
            "sZeroRecords": "No se encontraron resultados",
            "emptyTable": "No hay datos disponibles",
            "info": "_START_ al _END_ Total: _TOTAL_",
            "infoEmpty": "0",
            "infoFiltered": "filtrado de un total de _MAX_ registros",
            "infoPostFix": "",
            "searchPlaceholder": "Buscar",
            "search": "Buscar",
            "paginate": {
                "previous": "Anterior",
                "next": "Siguiente"
            }
        },
        "paging": false,
        "ordering": false,
        "scrollY": "300px", // Corregido de "scroll" a "scrollY"
        "order": [], // Corregido de "sort" a "order"
        "infoThousands": ",",
        "stripeClasses": ['odd', 'even'], // Corregido el valor de stripeClasses
        "columnDefs": [ // Reemplazado el ajax de ordenamiento por columnDefs
            {
                "targets": '_all',
                "sortable": true
            }
        ],
        "columns": [
            {data: "id_alumno"},
            {data: "nombre"},
            {data: "apellido_paterno"},
            {data: "apellido_materno"},
            {data: "edad"},
            {data: "genero"}
        ]
    });
}
function obtenVariable(){
    const edad = $('#edad').val(); 
    const nombre = $('#nombre').val(); 
    
    console.log(nombre);
    console.log(edad * 5);
}

function inicio() {
    $.ajax({
        type: "GET",
        url: "alumnos/listarAlumnos",
        dataType: "json",
        success: function(data) {
            console.log(data[0]);
        },
        error: function(e) {
            toastr["warning"]("Error al recuperar los Alumnos", {progressBar: true, closeButton: true});
        }
    });
}
