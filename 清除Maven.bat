set REPOSITORY_PATH=D:\Program Files\apache-maven-3.3.9\MavenRepository
for /f "delims=" %%i in ('dir /b /s "%REPOSITORY_PATH%\*lastUpdated*"') do (
    del /s /q %%i
)
pause