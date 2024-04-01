package com.SCMOTORS.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "sc-motors.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "C:\\proyectos\\proyecto_SCMOTORS";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "\\proyectoSCMOTORS\\src\\main\\resources\\firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "sc-motors-c5000-firebase-adminsdk-m63de-47898c329b.json";
}
