package framework.items


@Target(AnnotationTarget.FIELD)
annotation class DataContainer(val name: String, val data: String)
