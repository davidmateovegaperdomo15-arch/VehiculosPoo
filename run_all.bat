@echo off
echo 🚀 Iniciando Compilación Maestra de Java...
if not exist bin mkdir bin
javac -d bin src/basics/.java src/oop/.java src/functional/.java src/exceptions/.java src/collections/.java src/annotations/.java src/generics/.java src/io/.java src/concurrency/*.java

echo ✅ Compilación completada.
echo ------------------------------------------------

set modules=basics oop functional exceptions collections annotations generics io concurrency

for %%m in (%modules%) do (
    echo 📦 Ejecutando Modulo: %%m
    java -cp bin %%m.Main
    echo ------------------------------------------------
)

echo 🏁 Todos los modulos se han ejecutado con exito.
pause