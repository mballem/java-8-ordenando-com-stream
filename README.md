

# Java 8! Ordenando dados com Stream
___

**Projeto baseado no tutorial:** 

- <a href="https://www.mballem.com/post/java-8-ordenando-dados-com-stream/">Java 8! Ordenando dados com Stream</a>.

```
private static void testSortTwo(List<Person> persons) {
    persons.stream()
           .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
           .forEach(p -> System.out.println(p));
}
```

### 🛑 Pré-requistos
* Java 8 ou superior

### 🤝 Contribuindo

Desenvolvido e publicado pelo blog **[MBallem - Programando com Java](https://www.mballem.com/)**

Este repositório foi criado para fins de estudo. 

Se te ajudei de alguma forma ⭐️ Star o projeto.



