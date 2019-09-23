import requests
python_vm = requests.get('http://35.193.105.234:5000').elapsed.total_seconds()
python_appengine = requests.get('https://plenary-ellipse-250619.appspot.com').elapsed.total_seconds()
java_appengine = requests.get('http://magnetic-quasar-252617.appspot.com').elapsed.total_seconds()
print("Python VM: " + python_vm.__str__())
print("Python AppEngine: " + python_appengine.__str__())
print("Java AppEngine: " + java_appengine.__str__())
#print(r.text)