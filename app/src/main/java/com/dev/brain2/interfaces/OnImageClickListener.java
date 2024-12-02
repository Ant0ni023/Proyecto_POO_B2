package com.dev.brain2.interfaces;

import com.dev.brain2.models.Image;

/**
 * Esta interfaz define los métodos para manejar las interacciones del usuario con las imágenes.
 */
public interface OnImageClickListener {
    /**
     * Se llama cuando el usuario hace clic normal en una imagen.
     *
     * @param image La imagen que fue clickeada.
     */
    void onImageClick(Image image);

    /**
     * Se llama cuando el usuario mantiene presionada una imagen.
     *
     * @param image    La imagen que fue presionada.
     * @param position La posición de la imagen en la lista.
     */
    void onImageLongClick(Image image, int position);
}
