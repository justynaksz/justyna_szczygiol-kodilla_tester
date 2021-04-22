C:\Users\user\build\libs> del *.jar
call gradlew build
IF *.jar EXISTS goto exists
ELSE notexist

:exists
copy . project

:notexist
echo Compilation error