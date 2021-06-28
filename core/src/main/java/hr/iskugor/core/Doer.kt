package hr.iskugor.core

class Doer(private val backend: IBackend, private val database: IDatabase) {
    fun doSomething() {
        backend.fetchSomething()
        database.storeSomething()
    }
}