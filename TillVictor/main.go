package main

import "fmt"

type Chinese struct{}

func (a *Chinese) SagHalloAufChinesisch() {
    fmt.Println("你好")
}

type Deutscher interface{
	SagHalloAufDeutsch()
}

type Übersetzer struct{
	chinese *Chinese
}

func (s *Übersetzer) SagHalloAufDeutsch() {
    s.chinese.SagHalloAufChinesisch()
}

func main(){
	chinese := &Chinese{}

    übersetzer := &Übersetzer{
        chinese: chinese,
    }

    übersetzer.SagHalloAufDeutsch()
}
