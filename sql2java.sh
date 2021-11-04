ant -f build-sql2java.xml init
cd $SQL2JAVA_BASE
ant
cd -
ant -f build-sql2java.xml copy
read -p "Press any key to continue…" var
