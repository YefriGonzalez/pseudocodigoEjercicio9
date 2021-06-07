Algoritmo Ejercicio9
	control=0
	sumatoriaTemperatura=0
	t1=1
	t2=1
	Mientras t1<>0 Hacer
		Escribir "Ingrese la temperatura 1, debe estar en el rango de 5 a 15 grados"
		Leer t1
		Escribir "Ingrese la temperatura 2, debe estar en el rango de 5 a 15 grados"
		Leer t2
		Si t1<5 o t1>15 o t2<5 o t2>15 Entonces
			Escribir "Los datos son incorrectos"
		SiNo
			sumatoriaTemperatura=sumatoriaTemperatura+t1+t2
			control=control+1
		FinSi
	FinMientras
	
	promedio=(sumatoriaTemperatura/control)
	Escribir "El promedio es " promedio
	
FinAlgoritmo
