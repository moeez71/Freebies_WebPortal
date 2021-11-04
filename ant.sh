export JAVA_HOME=/home/moeez71/development/jdk1.8.0_91
echo "Using JAVA home: $JAVA_HOME"
rm -rf war
ant war
read -p "Press any key to continue…" var
