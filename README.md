# Домашнее задание №42

> Всем привет! На занятии мы сделали достаточно сложную аннотацию,
> которая безусловно поможет нам сделать крутой итоговый проект
> и облегчит жизнь каждому из вас, поскольку проверять роли 
> будет совсем просто. Однако практика - это важно. В домашке надо сделать 
> две простых аннотации, чтобы вы запомнили, как это вообще работает.

## Задание 1
В обычном java-приложении создайте свою аннотацию, 
которую можно навесить на метод и назовите ее `SimpleHelloAnnotation`.
Внутри метода просто выводите `Hello, world`, но внутри 
аннотации сделайте так, чтобы при каждом вызове этого метода в консоль 
печаталось `I love Codemika!`. 

А потом просто вызовите этот метод три раза через `for`. 
В итоге у вас должно три раза вывестить `Hello, world` и `I love Codemika!`.

## Задание №2
Теперь чуть посложнее. Создайте `spring-boot` приложение, внутри
которого будет два контроллера. Один будет возвращать строку c вашим именем,
а другой любую эпичную цитату на ваш вкус (только приличную!).

На каждый контроллер надо навесить аннотацию `InfoAnnotation`, которую надо написать самим. 
Внутри этой аннотации надо принимать название метода (строкой) и выводить в лог
информацию о том, что пользователь вызвал тот или иной метод.

То есть когда я буду вызывать контроллер с цитатой, то в лог должна вывестись информация об этом. 
Если я вызову этот метод три раза - должно появиться три записи о вызове этого метода.

> Для вывода информации можете использовать аннотацию `@Slf4j` из библиотеки Lombok 
> или обычный `System.out.println()`

***

По всем вопросам пишите в мой телеграм -> https://t.me/korizza