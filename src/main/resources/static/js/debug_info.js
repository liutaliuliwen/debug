
//            $("#raw_material_state_5").focus(function(){
//                $("#raw_material_mesh").removeAttr("readonly");
//                console.log("hello")
//            });
    $("input").change(function(){
        console.log("hello")
        if($("#raw_material_state_5").prop("checked")){
            console.log("hello")
            $("#raw_material_mesh").removeAttr("disabled");
        }

    }).change();

// $( "select" )
//     .change(function () {
//         var str = "";
//         $( "select option:selected" ).each(function() {
//             str += $( this ).text() + " ";
//         });
//         $( "div" ).text( str );
//     })
//     .change();



