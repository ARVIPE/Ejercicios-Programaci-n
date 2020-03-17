for $marvel in doc('superheroes.xml')/marvel
let $media := avg($marvel/superheroe/@nivel)
return <superheroe> { data($media)}</superheroe>