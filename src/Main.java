import domain.*;

public class Main {

    public static void main(String[] args) {
        
        
    }
    
    private Script CreateScript() {
        
        ScriptTopic topicObjetivoDeAula = new ScriptTopic(
            1,
            "Objetivo de Aula",
            "Ordenar alfabeticamente o conteúdo de vários arquivos dispostos em um diretório usando a linguagem de programação C++"
        );
        
        ScriptTopic topicArquivos = new ScriptTopic(
            2,
            "Arquivos",
            "Arquivos são estruturas de dados acessados por programas como uma forma durável de armazenamento [...]"
        );
        
        ScriptTopic topicLinguagem = new ScriptTopic(
            3,
            "Linguagem C++",
            "Em 1985, Bjarne Stroustrup criou uma linguagem de propósito geral baseada na flexibilidade, perfomance e sintáxe de C [...]"  
        );
        
        ScriptTopic topicStdLib = new ScriptTopic(
            4,
            "STD Lib",
            "Conhecida como Standard Library (ou Biblioteca Padrão), ela prove alguma facilidades para [...]"
        );
        
        ScriptTopic topicCompilacao = new ScriptTopic(
            5,
            "Compilação do C++",
            "Para criar o primeiro progra em C++, deve-se primeiramente abrir o editor de textos à sua preferência e [...]"
        );
        
        ScriptTopic topicStrings = new ScriptTopic(
            6,
            "Strings",
            "Strings são tradicionalmente um tipo de dados para armazenar sequências de caracteres (ou palavras). A sua representação em memória é binária e [...]"
        );
        
        ScriptTopic topicOrdenacao = new ScriptTopic(
            7,
            "Função de Ordenação",
            "A partir do C++ 11 está disponível na biblioteca padrão a função sort, que recebe [...]"
        );
        
        Script script = new Script();
        script.add(topicObjetivoDeAula);
        script.add(topicArquivos);
        script.add(topicLinguagem);
        script.add(topicStdLib);
        script.add(topicCompilacao);
        script.add(topicStrings);
        script.add(topicOrdenacao);
        
        ScriptTopicRelation relationObjetivoDeAula = new ScriptTopicRelation(topicObjetivoDeAula);
        script.add(relationObjetivoDeAula);
        
        ScriptTopicRelation relationArquivos = new ScriptTopicRelation(topicArquivos);
        relationArquivos.addDependency(topicObjetivoDeAula);
        script.add(relationArquivos);
        
        ScriptTopicRelation relationLinguagem = new ScriptTopicRelation(topicLinguagem);
        relationLinguagem.addDependency(topicObjetivoDeAula);
        script.add(relationLinguagem);
        
        ScriptTopicRelation relationStdLib = new ScriptTopicRelation(topicStdLib);
        relationStdLib.addDependency(topicLinguagem);
        script.add(relationStdLib);
        
        ScriptTopicRelation relationCompilacao = new ScriptTopicRelation(topicCompilacao);
        relationCompilacao.addDependency(topicLinguagem);
        script.add(relationCompilacao);
        
        ScriptTopicRelation relationStrings = new ScriptTopicRelation(topicStrings);
        relationStrings.addDependency(topicArquivos);
        script.add(relationStrings);
        
        ScriptTopicRelation relationOrdenacao = new ScriptTopicRelation(topicOrdenacao);
        relationOrdenacao.addDependency(topicStdLib);
        script.add(relationOrdenacao);
        
        return script;
    }
}
