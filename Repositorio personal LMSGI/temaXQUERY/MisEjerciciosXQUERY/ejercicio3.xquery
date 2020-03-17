for $superheroe in doc('superheroes.xml')/marvel/superheroe
let $poderesSuperheroe := $superheroe/@poderes
let $amigosSuperheroe := $superheroe/@amigos
where contains($poderesSuperheroe, 'fuerza') and contains($amigosSuperheroe, 'Iron Man')
return <superheroe nombre="{data($superheroe/@nombre)}"> { data($poderesSuperheroe) } { data($amigosSuperheroe)}</superheroe>