package divyansh.tech.kotnewreader.network.models.MLModels

data class Emotion(
    val prediction: String,
    val probability: Double
)

data class communicationAnalysis(
    val predictions: MutableList<Emotion>
)
