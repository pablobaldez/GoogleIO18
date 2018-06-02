package com.example.pablo.googleio18.utils

import android.os.CountDownTimer

object FakeLongDataLoading {

    private val arrayList = ArrayList<String>()
    init {
        arrayList.add("Chatbots: Da persona ao Bot")
        arrayList.add("BlockChain - Descentralização e Pagamentos 3.0")
        arrayList.add("Estratégia de produção de vídeo para o digital")
        arrayList.add("Tecnologias para o consumidor multidimensional")
        arrayList.add("DataLab - Uma Ponte entre Startups e Grandes Clientes")
        arrayList.add("Comunicação para STARTUPS: Como os memes podem viralizar a sua marca")
        arrayList.add("Infraestruture for mobile at Nubank")
        arrayList.add("A Nova Economia e o Ecossistema de Startups")
        arrayList.add("Design Sprint: O que é? Como fazer? E o que não está no livro.")
        arrayList.add("Desenvolvendo Jogos em Realidade Virtual")
        arrayList.add("Google Marketing: do clique à venda")
        arrayList.add("Blockchain e as Novas Oportunidades de Negócios")
        arrayList.add("A Magia do Firebase nos seu Apps")
        arrayList.add("Painel: O casamento do Marketing e da tecnologia")
        arrayList.add("Agile Design para inovação em produtos digitais")
        arrayList.add("Design reboot: provocação, inovação e disrupção nas tendências do SXSW")
        arrayList.add("Introdução ao Aprendizado de Máquina com Python")
        arrayList.add("Automação de Testes em Ambientes Híbridos")
        arrayList.add("Bigdata - Hadoop e seu Ecossistema")
        arrayList.add("Desenvolvimento Android - Primeiros Passos")
        arrayList.add("Abelhas Chipadas, ou: Aprimorando o entendimento de insetos sociais e suas aplicações em monitoramento de ecossistemas")
        arrayList.add("Como é utilizar Architecture Components na prática")
        arrayList.add("Controlando Drones via Mobile/Embarcados e suas aplicações")
        arrayList.add("Controlando Drones: Construindo um App com Kotlin + Anko + Firebase")
        arrayList.add("Projeto EST: Plataforma de Smart Parking")
        arrayList.add("Zerando o Mindset")
        arrayList.add("Hack.Ad.thon: conteúdo, publicidade e entretenimento")
        arrayList.add("Inteligência artificial na era cognitiva")
        arrayList.add("AfroPython: Tecnologia e Ativismo")
        arrayList.add("Quando eu deixei de ser um programador júnior?")
        arrayList.add("Minerando Sonhos: Mineração, Blockchain e a revolução da Tokenização de Comodities")
        arrayList.add("Machine learning para reconhecimento de padrões em tempo real")
        arrayList.add("Como estamos trazendo inovação para Porto Alegre?")
        arrayList.add("Programando um Game em 45min")
        arrayList.add("Mobilidade, tecnologia e sustentabilidade - Case Loop Bike Sharing")
        arrayList.add("Experiência em Pagamento com You")
        arrayList.add("Estacionamento rotativo com IOT")
        arrayList.add("Growth Hacking - Como uma Mentalidade Disruptiva Pode Alavancar o Seu Negócio")
        arrayList.add("Data Driven para Startups")
    }

    fun load(onLoad: () -> Unit) {
        val counter = object : CountDownTimer(3000, 1000){
            override fun onFinish() {
                onLoad()
            }

            override fun onTick(millisUntilFinished: Long) {}

        }
        counter.start()
    }

    fun loadSpeeches(onLoad: (ArrayList<String>) -> Unit) {
        load { onLoad(arrayList) }
    }

}