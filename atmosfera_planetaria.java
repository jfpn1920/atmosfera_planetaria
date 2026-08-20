import java.util.Scanner;
public class atmosfera_planetaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombresPlanetas = new String[10];
        String[] tiposPlanetas = new String[10];
        String[] composiciones = new String[10];
        String[] temperaturas = new String[10];
        String[] presiones = new String[10];
        String[] oxigenos = new String[10];
        String[] nitrogenos = new String[10];
        String[] dioxidosCarbono = new String[10];
        String[] presenciaAgua = new String[10];
        String[] estadosAtmosfericos = new String[10];
        int total = 0;
        int opcion;
        //--------------------------------------------//
        //--|menu_principal_de_atmosfera_planetaria|--//
        //--------------------------------------------//
        do {
            System.out.println("menu principal de atmosfera planetaria");
            System.out.println("1) Registrar planeta");
            System.out.println("2) Editar planeta");
            System.out.println("3) Listar planetas");
            System.out.println("4) Buscar planeta");
            System.out.println("5) Eliminar planeta");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_planeta|--//
                //-----------------------//
                case 1:
                    if (total >= nombresPlanetas.length) {
                        System.out.println("No hay espacio para registrar mas planetas.");
                        break;
                    }
                    System.out.println("registro de atmosfera planetaria");
                    System.out.println("ID: " + (total + 1));
                    System.out.print("nombre del planeta: ");
                    nombresPlanetas[total] = entrada.nextLine();
                    System.out.print("tipo de planeta: ");
                    tiposPlanetas[total] = entrada.nextLine();
                    System.out.print("composicion principal: ");
                    composiciones[total] = entrada.nextLine();
                    System.out.print("temperatura: ");
                    temperaturas[total] = entrada.nextLine();
                    System.out.print("presion atmosferica: ");
                    presiones[total] = entrada.nextLine();
                    System.out.print("porcentaje de oxigeno: ");
                    oxigenos[total] = entrada.nextLine();
                    System.out.print("porcentaje de nitrogeno: ");
                    nitrogenos[total] = entrada.nextLine();
                    System.out.print("porcentaje de dioxido de carbono: ");
                    dioxidosCarbono[total] = entrada.nextLine();
                    System.out.print("presencia de agua: ");
                    presenciaAgua[total] = entrada.nextLine();
                    System.out.print("estado atmosferico: ");
                    estadosAtmosfericos[total] = entrada.nextLine();
                    total++;
                    System.out.println("Planeta registrado correctamente.");
                    break;
                //--------------------//
                //--|editar_planeta|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen planetas registrados.");
                        break;
                    }
                    System.out.println("datos de los planetas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Planeta: " + nombresPlanetas[i] + " | Tipo: " + tiposPlanetas[i] + " | Composicion: " + composiciones[i] + " | Temperatura: " + temperaturas[i] + " | Presion: " + presiones[i] + " | Oxigeno: " + oxigenos[i] + " | Nitrogeno: " + nitrogenos[i] + " | CO2: " + dioxidosCarbono[i] + " | Agua: " + presenciaAgua[i] + " | Estado: " + estadosAtmosfericos[i]);
                    }
                    System.out.print("Ingrese el ID del planeta a editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("editar planeta");
                        System.out.print("nuevo nombre: ");
                        nombresPlanetas[posicion] = entrada.nextLine();
                        System.out.print("nuevo tipo: ");
                        tiposPlanetas[posicion] = entrada.nextLine();
                        System.out.print("nueva composicion: ");
                        composiciones[posicion] = entrada.nextLine();
                        System.out.print("nueva temperatura: ");
                        temperaturas[posicion] = entrada.nextLine();
                        System.out.print("nueva presion atmosferica: ");
                        presiones[posicion] = entrada.nextLine();
                        System.out.print("nuevo porcentaje de oxigeno: ");
                        oxigenos[posicion] = entrada.nextLine();
                        System.out.print("nuevo porcentaje de nitrogeno: ");
                        nitrogenos[posicion] = entrada.nextLine();
                        System.out.print("nuevo porcentaje de dioxido de carbono: ");
                        dioxidosCarbono[posicion] = entrada.nextLine();
                        System.out.print("nueva presencia de agua: ");
                        presenciaAgua[posicion] = entrada.nextLine();
                        System.out.print("nuevo estado atmosferico: ");
                        estadosAtmosfericos[posicion] = entrada.nextLine();
                        System.out.println("Planeta actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_planetas|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen planetas registrados.");
                    } else {
                        System.out.println("lista de planetas");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Planeta: " + nombresPlanetas[i] + " | Tipo: " + tiposPlanetas[i] + " | Composicion: " + composiciones[i] + " | Temperatura: " + temperaturas[i] + " | Presion: " + presiones[i] + " | Oxigeno: " + oxigenos[i] + " | Nitrogeno: " + nitrogenos[i] + " | CO2: " + dioxidosCarbono[i] + " | Agua: " + presenciaAgua[i] + " | Estado: " + estadosAtmosfericos[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_planeta|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen planetas registrados.");
                        break;
                    }
                    System.out.println("busqueda de planeta");
                    System.out.print("Ingrese el ID del planeta a buscar: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("planeta encontrado");
                        System.out.println("ID: " + idBusqueda + " | Planeta: " + nombresPlanetas[posicion] + " | Tipo: " + tiposPlanetas[posicion] + " | Composicion: " + composiciones[posicion] + " | Temperatura: " + temperaturas[posicion] + " | Presion: " + presiones[posicion] + " | Oxigeno: " + oxigenos[posicion] + " | Nitrogeno: " + nitrogenos[posicion] + " | CO2: " + dioxidosCarbono[posicion] + " | Agua: " + presenciaAgua[posicion] + " | Estado: " + estadosAtmosfericos[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_planeta|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen planetas registrados.");
                        break;
                    }
                    System.out.println("datos de los planetas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Planeta: " + nombresPlanetas[i] + " | Tipo: " + tiposPlanetas[i] + " | Composicion: " + composiciones[i] + " | Temperatura: " + temperaturas[i] + " | Presion: " + presiones[i] + " | Oxigeno: " + oxigenos[i] + " | Nitrogeno: " + nitrogenos[i] + " | CO2: " + dioxidosCarbono[i] + " | Agua: " + presenciaAgua[i] + " | Estado: " + estadosAtmosfericos[i]);
                    }
                    System.out.print("Ingrese el ID del planeta a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombresPlanetas[i] = nombresPlanetas[i + 1];
                            tiposPlanetas[i] = tiposPlanetas[i + 1];
                            composiciones[i] = composiciones[i + 1];
                            temperaturas[i] = temperaturas[i + 1];
                            presiones[i] = presiones[i + 1];
                            oxigenos[i] = oxigenos[i + 1];
                            nitrogenos[i] = nitrogenos[i + 1];
                            dioxidosCarbono[i] = dioxidosCarbono[i + 1];
                            presenciaAgua[i] = presenciaAgua[i + 1];
                            estadosAtmosfericos[i] = estadosAtmosfericos[i + 1];
                        }
                        total--;
                        System.out.println("Planeta eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen planetas registrados.");
                        break;
                    }
                    int aguaSi = 0;
                    int aguaNo = 0;
                    int aguaDesconocida = 0;
                    int estable = 0;
                    int inestable = 0;
                    int densa = 0;
                    int tenue = 0;
                    int toxica = 0;
                    int desconocida = 0;
                    for (int i = 0; i < total; i++) {
                        if (presenciaAgua[i].equalsIgnoreCase("Si")) {
                            aguaSi++;
                        } else if (presenciaAgua[i].equalsIgnoreCase("No")) {
                            aguaNo++;
                        } else {
                            aguaDesconocida++;
                        }
                        if (estadosAtmosfericos[i].equalsIgnoreCase("Estable")) {
                            estable++;
                        } else if (estadosAtmosfericos[i].equalsIgnoreCase("Inestable")) {
                            inestable++;
                        } else if (estadosAtmosfericos[i].equalsIgnoreCase("Densa")) {
                            densa++;
                        } else if (estadosAtmosfericos[i].equalsIgnoreCase("Tenue")) {
                            tenue++;
                        } else if (estadosAtmosfericos[i].equalsIgnoreCase("Toxica")) {
                            toxica++;
                        } else {
                            desconocida++;
                        }
                    }
                    String tipoMayor = tiposPlanetas[0];
                    int cantidadTipoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTipo = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposPlanetas[i].equalsIgnoreCase(tiposPlanetas[j])) {
                                cantidadTipo++;
                            }
                        }
                        if (cantidadTipo > cantidadTipoMayor) {
                            cantidadTipoMayor = cantidadTipo;
                            tipoMayor = tiposPlanetas[i];
                        }
                    }
                    String composicionMayor = composiciones[0];
                    int cantidadComposicionMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadComposicion = 0;
                        for (int j = 0; j < total; j++) {
                            if (composiciones[i].equalsIgnoreCase(composiciones[j])) {
                                cantidadComposicion++;
                            }
                        }
                        if (cantidadComposicion > cantidadComposicionMayor) {
                            cantidadComposicionMayor = cantidadComposicion;
                            composicionMayor = composiciones[i];
                        }
                    }
                    String estadoMayor = estadosAtmosfericos[0];
                    int cantidadEstadoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEstado = 0;
                        for (int j = 0; j < total; j++) {
                            if (estadosAtmosfericos[i].equalsIgnoreCase(estadosAtmosfericos[j])) {
                                cantidadEstado++;
                            }
                        }
                        if (cantidadEstado > cantidadEstadoMayor) {
                            cantidadEstadoMayor = cantidadEstado;
                            estadoMayor = estadosAtmosfericos[i];
                        }
                    }
                    System.out.println("resumen de atmosfera planetaria");
                    System.out.println("Planetas registrados: " + total);
                    System.out.println("Tipo mas frecuente: " + tipoMayor);
                    System.out.println("Composicion mas frecuente: " + composicionMayor);
                    System.out.println("Estado atmosferico mas frecuente: " + estadoMayor);
                    System.out.println("Con agua: " + aguaSi);
                    System.out.println("Sin agua: " + aguaNo);
                    System.out.println("Agua desconocida: " + aguaDesconocida);
                    System.out.println("Atmosferas estables: " + estable);
                    System.out.println("Atmosferas inestables: " + inestable);
                    System.out.println("Atmosferas densas: " + densa);
                    System.out.println("Atmosferas tenues: " + tenue);
                    System.out.println("Atmosferas toxicas: " + toxica);
                    System.out.println("Atmosferas desconocidas: " + desconocida);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Atmosfera Planetaria.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}