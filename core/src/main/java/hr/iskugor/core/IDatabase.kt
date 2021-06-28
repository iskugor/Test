package hr.iskugor.core

interface IDatabase {
    fun getAccessId(): String?
    fun storeSomething()
}