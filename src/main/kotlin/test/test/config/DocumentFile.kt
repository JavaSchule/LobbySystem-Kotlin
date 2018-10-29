package test.test.config

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

abstract class DocumentFile constructor(private val name: String) {

    protected val GSON: Gson = GsonBuilder().setPrettyPrinting().create()

    protected val path: Path = Paths.get("config/${this.name}.json")

    init {
        if (Files.notExists(this.path.parent)) {
            Files.createDirectories(this.path.parent)
        }

        if (Files.notExists(this.path)) {
            this.save()
        }
    }

    abstract fun load()

    abstract fun save()

}