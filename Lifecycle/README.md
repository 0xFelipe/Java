
# 🎵 Android Music Player (Lifecycle Example)

Este é um aplicativo Android simples desenvolvido em Java, que demonstra o uso do ciclo de vida de uma `Activity` para controlar a reprodução de áudio.

## 📱 Funcionalidades

- Tocar, pausar e parar uma música (`global.mp3` localizado na pasta `res/raw`).
- Demonstra o uso dos métodos do ciclo de vida (`onCreate`, `onStop`, `onDestroy`, `onRestart`) para manter o controle do estado da reprodução.
- Interface intuitiva com botões de controle (play, pause, stop).

## 🧠 Conceitos Demonstrados

- Ciclo de vida da `Activity`
- Manipulação de mídia com `MediaPlayer`
- Eventos de clique em `ImageView`
- Uso de `EdgeToEdge` e `WindowInsetsCompat` para interface moderna

## 🚀 Como usar

1. Clone este repositório e abra no Android Studio.
2. Certifique-se de ter um arquivo de áudio `global.mp3` em `res/raw/`.
3. Compile e execute em um emulador ou dispositivo físico.

## 🖼️ Interface

A interface possui três botões representados por `ImageView`:

- ▶️ **Play**: inicia a reprodução da música.
- ⏸️ **Pause**: pausa a música se estiver tocando.
- ⏹️ **Stop**: para a reprodução e reinicia o player.

## 📁 Estrutura básica

```
MainActivity.java
res/
 └── raw/
      └── global.mp3
 └── layout/
      └── activity_main.xml
```

## 📄 Licença

Este projeto é apenas para fins educacionais e está sob a licença MIT.

---

Desenvolvido por [@0xFelipe](https://github.com/0xFelipe)
